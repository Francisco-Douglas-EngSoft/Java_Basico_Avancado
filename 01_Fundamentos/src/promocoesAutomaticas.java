public class promocoesAutomaticas {
    public static void main(String[] args) {
        // Promoção automática acontece quando um tipo menor é convertido
        // para um tipo maior, sem perder o valor.
        byte numeroByte = 10;
        short numeroShort = numeroByte;
        int numeroInt = numeroShort;
        long numeroLong = numeroInt;
        float numeroFloat = numeroLong;
        double numeroDouble = numeroFloat;

        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);

        // Em uma operação, o Java também promove int para double.
        int quantidade = 5;
        double preco = 2.50;
        double total = quantidade * preco;
        System.out.println("Total: " + total);
    }
}
