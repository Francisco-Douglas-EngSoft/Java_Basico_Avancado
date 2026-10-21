public class operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + b);

        // Operadores aritméticos
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // Operadores de comparação
        boolean igual = (a == b);
        boolean diferente = (a != b);
        boolean maior = (a > b);
        boolean menor = (a < b);
        boolean maiorOuIgual = (a >= b);
        boolean menorOuIgual = (a <= b);

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        boolean e = condicao1 && condicao2; // AND
        boolean ou = condicao1 || condicao2; // OR
        boolean nao = !condicao1; // NOT

        System.out.println("AND: " + e);
        System.out.println("OR: " + ou);
        System.out.println("NOT: " + nao);
    }
    
}
