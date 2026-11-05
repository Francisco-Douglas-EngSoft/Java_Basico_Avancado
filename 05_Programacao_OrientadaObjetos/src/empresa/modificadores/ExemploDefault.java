package empresa.modificadores;

class AuxiliarDefault {
    String mensagem = "Acesso de pacote (default)";

    void exibirMensagem() {
        System.out.println(mensagem);
    }
}

public class ExemploDefault {
    public static void main(String[] args) {
        AuxiliarDefault exemplo = new AuxiliarDefault();
        exemplo.exibirMensagem();
    }
}
