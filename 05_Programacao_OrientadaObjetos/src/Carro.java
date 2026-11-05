public class Carro {
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;

    public Carro() {
        this("Desconhecida", "Desconhecido", 0);
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 0);
    }

    public Carro(String marca, String modelo, int ano) {
        this.marcaDoCarro = marca;
        this.modeloDoCarro = modelo;
        this.anoDoCarro = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println();
    }
}
