public class op_Atribuicao {
    public static void main(String[] args) {
        int valor = 10;

        System.out.println("=== Operadores de atribuição ===");

        // = atribui um valor à variável.
        System.out.println("Valor inicial: " + valor);

        // += soma o valor à variável e guarda o resultado nela.
        valor += 5; // Equivale a: valor = valor + 5;
        System.out.println("Após valor += 5: " + valor);

        // -= subtrai o valor da variável e guarda o resultado nela.
        valor -= 3; // Equivale a: valor = valor - 3;
        System.out.println("Após valor -= 3: " + valor);

        // *= multiplica a variável pelo valor e guarda o resultado nela.
        valor *= 2; // Equivale a: valor = valor * 2;
        System.out.println("Após valor *= 2: " + valor);

        // /= divide a variável pelo valor e guarda o resultado nela.
        valor /= 4; // Equivale a: valor = valor / 4;
        System.out.println("Após valor /= 4: " + valor);

        // %= guarda na variável o resto da divisão.
        valor %= 3; // Equivale a: valor = valor % 3;
        System.out.println("Após valor %= 3: " + valor);

        // A atribuição composta atualiza a própria variável.
    }
}
