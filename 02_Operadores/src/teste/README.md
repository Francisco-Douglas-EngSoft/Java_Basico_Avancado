# Exemplo: Java com HTML e CSS

Neste exemplo, o servidor Java entrega a página `index.html` e o arquivo `style.css` ao navegador. Ao enviar o formulário, o navegador faz uma requisição `POST` para `/saudacao`; o Java lê o nome e devolve uma página com a resposta.

- **HTML**: estrutura e formulário da página.
- **CSS**: aparência da página.
- **Java**: servidor, leitura do formulário e criação da resposta.

## Como executar

Abra um terminal nesta pasta e rode:

```text
javac --add-modules jdk.httpserver Servidor.java
java --add-modules jdk.httpserver Servidor
```

Depois, abra `http://localhost:8080` no navegador. Para encerrar o servidor, volte ao terminal e pressione `Ctrl+C`.

Mantenha `Servidor.java`, `index.html` e `style.css` nesta mesma pasta enquanto executa o programa.
