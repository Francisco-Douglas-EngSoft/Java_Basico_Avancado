import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Servidor {
    public static void main(String[] args) throws IOException {
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

        servidor.createContext("/", Servidor::servirPagina);
        servidor.createContext("/style.css", Servidor::servirEstilos);
        servidor.createContext("/saudacao", Servidor::processarSaudacao);

        servidor.start();
        System.out.println("Servidor iniciado em http://localhost:8080");
    }

    private static void servirPagina(HttpExchange requisicao) throws IOException {
        if (!requisicao.getRequestMethod().equals("GET")
                || !requisicao.getRequestURI().getPath().equals("/")) {
            responder(requisicao, 404, "text/plain; charset=UTF-8", "Página não encontrada.");
            return;
        }

        responderArquivo(requisicao, "index.html", "text/html; charset=UTF-8");
    }

    private static void servirEstilos(HttpExchange requisicao) throws IOException {
        if (!requisicao.getRequestMethod().equals("GET")) {
            responder(requisicao, 405, "text/plain; charset=UTF-8", "Método não permitido.");
            return;
        }

        responderArquivo(requisicao, "style.css", "text/css; charset=UTF-8");
    }

    private static void processarSaudacao(HttpExchange requisicao) throws IOException {
        if (!requisicao.getRequestMethod().equals("POST")) {
            responder(requisicao, 405, "text/plain; charset=UTF-8", "Use o formulário para enviar seu nome.");
            return;
        }

        String corpo = new String(requisicao.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
        Map<String, String> campos = lerFormulario(corpo);
        String nome = campos.getOrDefault("nome", "").trim();

        if (nome.isEmpty()) {
            responder(requisicao, 400, "text/html; charset=UTF-8",
                    criarPaginaResposta("Digite seu nome antes de enviar."));
            return;
        }

        responder(requisicao, 200, "text/html; charset=UTF-8",
                criarPaginaResposta("Olá, " + escaparHtml(nome) + "! O Java recebeu seu nome."));
    }

    private static Map<String, String> lerFormulario(String corpo) {
        Map<String, String> campos = new HashMap<>();
        for (String campo : corpo.split("&")) {
            String[] partes = campo.split("=", 2);
            String chave = URLDecoder.decode(partes[0], StandardCharsets.UTF_8);
            String valor = partes.length > 1
                    ? URLDecoder.decode(partes[1], StandardCharsets.UTF_8)
                    : "";
            campos.put(chave, valor);
        }
        return campos;
    }

    private static String criarPaginaResposta(String mensagem) {
        return """
                <!DOCTYPE html>
                <html lang="pt-BR">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Resposta do Java</title>
                    <link rel="stylesheet" href="/style.css">
                </head>
                <body>
                    <main class="cartao">
                        <h1>Resposta do servidor Java</h1>
                        <p>%s</p>
                        <a href="/">Voltar ao formulário</a>
                    </main>
                </body>
                </html>
                """.formatted(mensagem);
    }

    private static String escaparHtml(String texto) {
        return texto.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }

    private static void responderArquivo(HttpExchange requisicao, String nome, String tipo) throws IOException {
        Path caminho = Path.of(nome);
        if (!Files.exists(caminho)) {
            responder(requisicao, 500, "text/plain; charset=UTF-8",
                    "Arquivo não encontrado: " + nome);
            return;
        }

        byte[] conteudo = Files.readAllBytes(caminho);
        requisicao.getResponseHeaders().set("Content-Type", tipo);
        requisicao.sendResponseHeaders(200, conteudo.length);
        requisicao.getResponseBody().write(conteudo);
        requisicao.close();
    }

    private static void responder(HttpExchange requisicao, int status, String tipo, String texto)
            throws IOException {
        byte[] conteudo = texto.getBytes(StandardCharsets.UTF_8);
        requisicao.getResponseHeaders().set("Content-Type", tipo);
        requisicao.sendResponseHeaders(status, conteudo.length);
        requisicao.getResponseBody().write(conteudo);
        requisicao.close();
    }
}
