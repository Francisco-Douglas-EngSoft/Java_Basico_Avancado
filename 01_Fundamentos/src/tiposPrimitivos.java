public class tiposPrimitivos {
    public static void main(String[] args){
        //Tipos Primitivos em Java
        //Tipos numéricos inteiros
        byte b = 127; // 8 bits
        short s = 32767; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits

        //Tipos numéricos reais
        float f = 3.14f; // 4 bytes
        double d = 3.141592653589793; // 8 bytes

        //Tipo caractere
        char c = 'A'; // 16 bits

        //Tipo booleano
        boolean bool = true; // 1 bit

        //Exibindo os valores das variáveis
        System.out.println("Valor do byte: " + b);
        System.out.println("Valor do short: " + s);
        System.out.println("Valor do int: " + i);
        System.out.println("Valor do long: " + l);
        System.out.println("Valor do float: " + f);
        System.out.println("Valor do double: " + d);
        System.out.println("Valor do char: " + c);
        System.out.println("Valor do boolean: " + bool);
    }
}
