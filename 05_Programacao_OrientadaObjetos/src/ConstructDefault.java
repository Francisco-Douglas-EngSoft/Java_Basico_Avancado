public class ConstructDefault {
     String nome;
    String cargo;
    int idade;

    //Utilizando a Inicialização de Objetos
    public ConstructDefault(String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    //Sobrecarga de Construtor
    public ConstructDefault(){
    }

    //Sobrecarga de Construtor
    public ConstructDefault(String nomeInit){
        nome = nomeInit;
    }

    public static void main(String[] args){
        ConstructDefault funcionario = new ConstructDefault("João", "Gerente", 35);
        ConstructDefault funcionario2 = new ConstructDefault();

        ConstructDefault funcionario3 = new ConstructDefault("Maria");

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Nome: " + funcionario3.nome);
    }
}
