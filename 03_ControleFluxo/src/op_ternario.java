public class op_ternario {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = (a > b) ? a : b; // Ternário
        System.out.println("O maior é: " + c);

        //Outro exemplo
        int idade = 18;
        String resultado = (idade < 18) ? "Não pode votar" : "Pode votar";
        System.out.println(resultado);
    }
}
