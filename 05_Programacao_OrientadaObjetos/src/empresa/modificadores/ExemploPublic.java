package empresa.modificadores;

public class ExemploPublic {
    public String mensagem = "Acesso publico";

    public void exibirMensagem() {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ExemploPublic exemplo = new ExemploPublic();
        exemplo.exibirMensagem();
    }
}
