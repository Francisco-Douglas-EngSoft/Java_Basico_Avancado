public class op_comparacao {
    public static void main(String[] args) {
        int idade = 18;
        int idadeMinima = 18;

        System.out.println("=== Operadores de comparação ===");
        System.out.println("Idade: " + idade);
        System.out.println("Idade mínima: " + idadeMinima);

        // == verifica se os valores são iguais.
        System.out.println("Igual (idade == idadeMinima): " + (idade == idadeMinima));

        // != verifica se os valores são diferentes.
        System.out.println("Diferente (idade != idadeMinima): " + (idade != idadeMinima));

        // > verifica se o valor da esquerda é maior.
        System.out.println("Maior (idade > idadeMinima): " + (idade > idadeMinima));

        // < verifica se o valor da esquerda é menor.
        System.out.println("Menor (idade < idadeMinima): " + (idade < idadeMinima));

        // >= verifica se é maior ou igual.
        System.out.println("Maior ou igual (idade >= idadeMinima): " + (idade >= idadeMinima));

        // <= verifica se é menor ou igual.
        System.out.println("Menor ou igual (idade <= idadeMinima): " + (idade <= idadeMinima));

        // Comparações produzem um resultado booleano: true (verdadeiro) ou false (falso).
    }
}
