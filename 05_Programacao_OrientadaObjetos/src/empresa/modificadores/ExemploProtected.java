package empresa.modificadores;

class BaseProtected {
    protected String mensagem = "Acesso protected pela subclasse";
}

public class ExemploProtected extends BaseProtected {
    public void exibirMensagem() {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ExemploProtected exemplo = new ExemploProtected();
        exemplo.exibirMensagem();
    }
}
