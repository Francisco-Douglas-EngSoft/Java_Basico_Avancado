public class op_logicos {
    public static void main(String[] args) {
        int idade = 20;
        boolean temIngresso = true;
        boolean estaChovendo = false;

        System.out.println("=== Operadores lógicos ===");

        // && (E): o resultado é true somente quando as duas condições são verdadeiras.
        boolean podeEntrar = idade >= 18 && temIngresso;
        System.out.println("Pode entrar (maior de idade E tem ingresso): " + podeEntrar);

        // || (OU): o resultado é true quando pelo menos uma condição é verdadeira.
        boolean podeFicarEmCasa = estaChovendo || idade < 18;
        System.out.println("Pode ficar em casa (está chovendo OU é menor de idade): " + podeFicarEmCasa);

        // ! (NÃO): inverte o valor lógico, transformando true em false e vice-versa.
        boolean naoEstaChovendo = !estaChovendo;
        System.out.println("Não está chovendo: " + naoEstaChovendo);

        // O resultado de uma expressão lógica é sempre booleano: true ou false.
    }
}
