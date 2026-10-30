public class tiposDados {
    public static void main(String[] args) {
        // Tipos primitivos guardam valores simples diretamente.
        byte idade = 25;                 // Inteiro pequeno: de -128 a 127.
        short populacaoCidade = 30_000;  // Inteiro maior que byte.
        int habitantes = 150_000;        // Inteiro usado com frequência.
        long distanciaEstrelas = 9_000_000_000L; // Inteiro grande; L indica long.

        float temperatura = 23.5f;       // Decimal com precisão menor; f indica float.
        double saldo = 1_250.75;         // Decimal com precisão maior; padrão para decimais.
        char inicial = 'J';              // Um único caractere, entre aspas simples.
        boolean estaChovendo = false;    // Apenas true ou false.

        System.out.println("=== Tipos primitivos ===");
        System.out.println("byte: " + idade);
        System.out.println("short: " + populacaoCidade);
        System.out.println("int: " + habitantes);
        System.out.println("long: " + distanciaEstrelas);
        System.out.println("float: " + temperatura);
        System.out.println("double: " + saldo);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + estaChovendo);

        // Tipos por referência apontam para objetos. String é uma classe.
        String nome = "Java";
        CharSequence texto = nome; // Uma interface também pode ser tipo de uma variável.
        int[] numeros = {1, 2, 3}; // Arrays são tipos por referência.
        Produto produto = new Produto("Caderno", 19.90); // Objeto de uma classe.
        Categoria categoria = Categoria.LIVRO; // Enum representa opções fixas.
        Integer quantidade = 10; // Wrapper: objeto que representa um int.
        String semValor = null; // null significa que a referência não aponta para um objeto.

        System.out.println("\n=== Tipos por referência ===");
        System.out.println("String: " + nome);
        System.out.println("Interface CharSequence: " + texto);
        System.out.println("Array (primeiro valor): " + numeros[0]);
        System.out.println("Objeto Produto: " + produto.nome + ", R$ " + produto.preco);
        System.out.println("Enum: " + categoria);
        System.out.println("Wrapper Integer: " + quantidade);
        System.out.println("Referência nula: " + semValor);
    }

    // Enum é um tipo definido pelo programa com um conjunto limitado de valores.
    enum Categoria {
        LIVRO,
        ROUPA
    }

    // Uma classe pode definir novos tipos por referência.
    static class Produto {
        String nome;
        double preco;

        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }
}
