public class operAritmeticos {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        System.out.println("=== Operadores aritméticos ===");
        System.out.println("Adição: " + n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println("Subtração: " + n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println("Multiplicação: " + n1 + " * " + n2 + " = " + (n1 * n2));

        // A divisão entre inteiros descarta a parte decimal.
        System.out.println("Divisão inteira: " + n1 + " / " + n2 + " = " + (n1 / n2));
        System.out.println("Divisão decimal: " + n1 + " / " + n2 + " = " + ((double) n1 / n2));
        System.out.println("Resto da divisão: " + n1 + " % " + n2+ " = " + (n1 % n2));

        int valor = 5;
        System.out.println("\n=== Incremento e decremento ===");
        System.out.println("Valor inicial: " + valor);
        System.out.println("Pós-incremento: " + valor++);
        System.out.println("Após incrementar: " + valor);
        System.out.println("Pré-incremento: " + (++valor));
        System.out.println("Pós-decremento: " + valor--);
        System.out.println("Após decrementar: " + valor);
        System.out.println("Pré-decremento: " + (--valor));
    }
}
