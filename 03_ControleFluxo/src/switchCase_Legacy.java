public class switchCase_Legacy {
    public static void main(String[] args){
        //Utilizando o switch case legado
        String dia = "Ter.";

        switch (dia) {
            case "Seg.":
            case "Ter.":
            case "Qua.":
            case "Qui.":
            case "Sex.":
                System.out.println("Dia útil");
                break;
            case "Sáb.":
            case "Dom.":
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
