public class bolo {
    String bolo;
    int quantidadeAcucar;

    public static void main(String[] args){
        bolo bolo1 = new bolo();
        bolo1.bolo = "Bolo de Chocolate";
        bolo1.quantidadeAcucar = 200;

        System.out.println("Para fazemos um " + bolo1.bolo + " precisamos de " + bolo1.quantidadeAcucar + " gramas de açúcar.");

        System.out.println("---------------------------------------------------");
        //Novo bolo
        bolo bolo2 = new bolo();
        bolo2.bolo = "Bolo de Cenoura";
        bolo2.quantidadeAcucar = 150;
        System.out.println("Para fazemos um " + bolo2.bolo + " precisamos de " + bolo2.quantidadeAcucar + " gramas de açúcar.");
    }
}
