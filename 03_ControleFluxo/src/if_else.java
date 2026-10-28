public class if_else {
    public static void main(String[] args){
        int idade = 18;

        if (idade <= 16){
            System.out.println("Não pode votar");
        } else if (idade >= 18){
            System.out.println("Pode votar");
        } else {
            System.out.println("Voto facultativo");
        }
    } 
}
