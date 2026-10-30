public class identificadores {

    public static void main(String[] args) {
        // Identificadores nomeiam classes, variáveis, métodos e constantes.
        String nomeCompleto = "Ana Souza";
        int idade2 = 25;
        final double PRECO_DO_CURSO = 199.90;

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade2);
        System.out.println("Preço com desconto: R$ " + calcularPreco(PRECO_DO_CURSO));
    }

    private static double calcularPreco(double preco) {
        return preco * 0.9;
    }

    /*
     * Regras: não comece um identificador com número, não use espaços
     * e não use palavras reservadas, como class ou int.
     * Java diferencia maiúsculas de minúsculas: nome e Nome são diferentes.
     *
     * Convenções: classes usam PascalCase; variáveis e métodos usam
     * camelCase; constantes usam MAIUSCULAS_COM_UNDERSCORES.
     */
}
