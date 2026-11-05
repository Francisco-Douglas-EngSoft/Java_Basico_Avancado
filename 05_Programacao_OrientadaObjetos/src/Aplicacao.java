public class Aplicacao {
    public static void main(String[] args) {
        Carro carroPadrao = new Carro();
        Carro carroSemAno = new Carro("Toyota", "Corolla");
        Carro carroCompleto = new Carro("Honda", "Civic", 2024);

        carroPadrao.exibirDetalhes();
        carroSemAno.exibirDetalhes();
        carroCompleto.exibirDetalhes();
    }
}
