
public class construtor_default {
    // Atributos da classe: representam os dados de uma pessoa.
    String nome;
    String cargo;
    int idade;

    // Construtor com parâmetros: recebe os valores quando um objeto é criado.
    construtor_default(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;   // guarda o nome recebido
        cargo = cargoInit; // guarda o cargo recebido
        idade = idadeInit; // guarda a idade recebida
    }

    // Construtor padrão: não recebe nenhum argumento.
    // Ele pode ser usado para criar um objeto vazio, sem inicializar os dados.
    construtor_default() {

    }

    public static void main(String[] args) {
        // Criação de objetos usando o construtor com dados.
        construtor_default pessoa1 = new construtor_default("João", "Desenvolvedor", 30);
        construtor_default pessoa2 = new construtor_default("Maria", "Analista", 25);

        // Exibindo as informações dos objetos criados.
        System.out.println("Pessoa 1: " + pessoa1.nome + ", Cargo: " + pessoa1.cargo + ", Idade: " + pessoa1.idade);
        System.out.println("Pessoa 2: " + pessoa2.nome + ", Cargo: " + pessoa2.cargo + ", Idade: " + pessoa2.idade);
    }
}

