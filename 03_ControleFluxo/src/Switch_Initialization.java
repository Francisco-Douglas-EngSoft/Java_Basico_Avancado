public class Switch_Initialization {
    public static void main(String[] args){
        //Switch com inicialização de variáveis
        String dia = "Ter.";

        String tipoDia = switch (dia) {
            case "Seg." -> "Dia útil";
            case "Ter." -> "Dia útil";
            case "Qua." -> "Dia útil";
            case "Qui." -> "Dia útil";
            case "Sex." -> "Dia útil";
            case "Sáb." -> "Final de semana";
            case "Dom." -> "Final de semana";
            default -> "Dia inválido";
        };
        System.out.println("O tipo do dia é: " + tipoDia);
    }
    
}
