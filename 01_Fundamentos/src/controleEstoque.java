public class controleEstoque {
    public static void main(String[] args){
        //Controle de estoque de produtos
        int quantidadeProduto = 100;
        String nomeProduto = "Notebook";
        double precoProduto = 2500.00;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
        System.out.println("Preço unitário: R$ " + precoProduto);

        //Atualizando o estoque
        quantidadeProduto -= 10; // Vendendo 10 unidades
        System.out.println("Quantidade em estoque após venda: " + quantidadeProduto);
    }
    
}
