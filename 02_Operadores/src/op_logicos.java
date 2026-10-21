public class op_logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos
        boolean e = condicao1 && condicao2; // AND
        boolean ou = condicao1 || condicao2; // OR
        boolean nao = !condicao1; // NOT

        System.out.println("AND: " + e);
        System.out.println("OR: " + ou);
        System.out.println("NOT: " + nao);
    }
}
