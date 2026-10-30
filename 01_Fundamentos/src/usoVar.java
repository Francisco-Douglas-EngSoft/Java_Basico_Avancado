public class usoVar {
    public static void main(String[] args){
        // var deixa o Java inferir o tipo a partir do valor inicial.
        var nome = "Ana";       // String
        var idade = 25;         // int
        var altura = 1.65;      // double
        var estudante = true;   // boolean

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);

        // var só pode ser usado em variáveis locais com valor inicial.
    }
}
