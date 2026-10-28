public class sobrecarga_constructor {
    // Atributos da classe: representam os dados da pessoa.
    String nome;
    String cargo;
    int idade;

    // Sobrecarga de construtores:
    // Java permite criar vários construtores na mesma classe,
    // desde que eles tenham assinaturas diferentes (quantidade ou tipo de parâmetros).

    // Construtor 1: recebe nome, cargo e idade.
    sobrecarga_constructor(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    // Construtor 2: recebe apenas o nome.
    // Aqui, os demais dados recebem valores padrão.
    sobrecarga_constructor(String nomeInit) {
        nome = nomeInit;
        cargo = "Não informado";
        idade = 0;
    }

    // Construtor 3: recebe nome e cargo.
    sobrecarga_constructor(String nomeInit, String cargoInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = 0;
    }

    // Construtor padrão: não recebe nenhum argumento.
    // É usado quando queremos criar um objeto com valores iniciais padrão.
    sobrecarga_constructor() {
        nome = "Não informado";
        cargo = "Não informado";
        idade = 0;
    }

    public static void main(String[] args) {
        // Java escolhe o construtor correto conforme os argumentos passados.

        sobrecarga_constructor pessoa1 = new sobrecarga_constructor("João", "Desenvolvedor", 30);
        sobrecarga_constructor pessoa2 = new sobrecarga_constructor("Maria");
        sobrecarga_constructor pessoa3 = new sobrecarga_constructor("Carlos", "Analista");
        sobrecarga_constructor pessoa4 = new sobrecarga_constructor();

        System.out.println("Pessoa 1: " + pessoa1.nome + ", Cargo: " + pessoa1.cargo + ", Idade: " + pessoa1.idade);
        System.out.println("Pessoa 2: " + pessoa2.nome + ", Cargo: " + pessoa2.cargo + ", Idade: " + pessoa2.idade);
        System.out.println("Pessoa 3: " + pessoa3.nome + ", Cargo: " + pessoa3.cargo + ", Idade: " + pessoa3.idade);
        System.out.println("Pessoa 4: " + pessoa4.nome + ", Cargo: " + pessoa4.cargo + ", Idade: " + pessoa4.idade);
    }
}

/*
Explicação simples:

Sobrecarga de construtores significa criar mais de um construtor na mesma classe,
mas com parâmetros diferentes. Isso permite que um objeto seja criado de diversas formas,
sem precisar escrever métodos separados para cada caso.

Exemplos:
- new sobrecarga_constructor("João", "Desenvolvedor", 30);
- new sobrecarga_constructor("Maria");
- new sobrecarga_constructor("Carlos", "Analista");
- new sobrecarga_constructor();

O Java decide qual construtor usar pela quantidade e pelo tipo dos argumentos.
*/

