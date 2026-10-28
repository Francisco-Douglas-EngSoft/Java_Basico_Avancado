public class Funcionarios {

    // Atributos da classe: representam as características de um funcionário
    String nome;      // guarda o nome do funcionário
    String cargo;     // guarda o cargo do funcionário
    int idade;        // guarda a idade do funcionário

    // Método principal: ponto de entrada do programa em Java
    public static void main(String[] args) {
        // Cria um objeto da classe Funcionarios
        Funcionarios funcionario = new Funcionarios();

        // Atribui valores aos atributos do objeto
        funcionario.idade = 45;              // define a idade
        funcionario.nome = "Abel";           // define o nome
        funcionario.cargo = "Desenvolvedor"; // define o cargo

        // Exibe uma mensagem inicial no console
        System.out.println("Imprimindo Informações do Funcionario:");

        // Exibe cada informação do funcionário
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Cargo: " + funcionario.cargo);
    }
}
