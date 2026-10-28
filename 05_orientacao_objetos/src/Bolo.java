public class Bolo {

    int quantidadeAcucar;

    public static void main(String[] args) {

        Bolo boloDeChocolate = new Bolo();

        boloDeChocolate.quantidadeAcucar = 100;
        System.out.println("Quantidade de açúcar do bolo de chocolate: " + boloDeChocolate.quantidadeAcucar + "g"); 

        Bolo boloDeMorango = new Bolo();
        boloDeMorango.quantidadeAcucar = 150;
        System.out.println("Quantidade de açúcar do bolo de morango: " + boloDeMorango.quantidadeAcucar + "g");
    }
    
}
