public class FuncConstrutores {
    String nome;
    String cargo;
    int idade;

    //Construtor java
    public FuncConstrutores(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    //Utilizando a Inicialização de Objetos
    // public FuncConstrutores(String nomeInit, String cargoInit, int idadeInit){
    //     nome = nomeInit;
    //     cargo = cargoInit;
    //     idade = idadeInit;
    // }

    public static void main(String[] args){
        FuncConstrutores funcionario = new FuncConstrutores("João", "Gerente", 35);

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }
}
