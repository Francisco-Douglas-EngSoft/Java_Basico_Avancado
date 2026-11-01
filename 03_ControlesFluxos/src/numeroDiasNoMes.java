public class numeroDiasNoMes {
    public static void main(String[] args) {
        int mes = 2;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("O mês tem 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("O mês tem 30 dias");
                break;
            case 2:
                System.out.println("O mês tem 28 ou 29 dias");
                break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
