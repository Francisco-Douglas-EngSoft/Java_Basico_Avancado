public class switchCaseInitialization {
    public static void main(String[] args) {

        String dia = "Ter";
        
        switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> System.out.println("Dia útil");
            case "Sáb.", "Dom." -> System.out.println("Fim de semana");
            default -> System.out.println("Dia inválido");
        };

        System.out.println("Fim do programa");
    }
}
