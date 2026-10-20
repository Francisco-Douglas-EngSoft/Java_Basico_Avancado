public class inferenciaTipo {
    public static void main(String[] args){
        //Inferencia de tipo e uma funcionalidade do 
        // Java que permite que o compilador deduza o 
        // tipo de uma variável com base no valor atribuído a ela. 
        // Isso significa que você não precisa declarar explicitamente 
        // o tipo da variável, o compilador fará isso por você.
        //A inferência de tipo é útil quando o tipo da variável 
        // é óbvio a partir do valor atribuído a ela, 
        // tornando o código mais conciso e legível.
        var nome = "João";
        var idade = 25;
        var altura = 1.75;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        //Outro exemplo de inferência de tipo é quando você usa
        //  uma expressão para inicializar uma variável. 
        // O compilador deduzirá o tipo da variável com base no tipo da expressão.
        var resultado = 10 + 5.5; // O compilador deduz que o tipo de resultado é double
        System.out.println("Resultado: " + resultado);
    }
    
}
