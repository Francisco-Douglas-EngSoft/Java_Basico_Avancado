public class Construtor {
    // Atributos da classe: representam os dados de um funcionário
    String nome;    // guarda o nome do funcionário
    String cargo;   // guarda o cargo do funcionário
    int idade;      // guarda a idade do funcionário

    // Este é o construtor da classe: ele inicializa os atributos quando um objeto é criado
    public Construtor(String nome, String cargo, int idade) {
        // this.nome refere-se ao atributo da classe
        // nome da direita refere-se ao parâmetro recebido no construtor
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    // Método principal: ponto de entrada do programa Java
    public static void main(String[] args) {
        // Cria o primeiro objeto da classe Construtor com os dados do funcionário Abel
        Construtor funcionario1 = new Construtor("Abel", "Desenvolvedor", 45);

        // Exibe o título da lista de informações
        System.out.println("Imprimindo Informações do Funcionario:");

        // Mostra os dados do primeiro funcionário
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("Cargo: " + funcionario1.cargo);

        // Linha separadora para organizar a saída no console
        System.out.println("---------------------------------------------------");

        // Cria o segundo objeto da classe Construtor com os dados da funcionária Maria
        Construtor funcionario2 = new Construtor("Maria", "Analista", 30);

        // Exibe o título novamente para o segundo funcionário
        System.out.println("Imprimindo Informações do Funcionario:");

        // Mostra os dados do segundo funcionário
        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Idade: " + funcionario2.idade);
        System.out.println("Cargo: " + funcionario2.cargo);
    }
}