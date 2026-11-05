package empresa.modificadores;

public class ExemploPrivate {
    private String senha = "abc123";

    public boolean validarSenha(String tentativa) {
        return senha.equals(tentativa);
    }

    public static void main(String[] args) {
        ExemploPrivate exemplo = new ExemploPrivate();
        System.out.println("Senha valida: " + exemplo.validarSenha("abc123"));
    }
}
