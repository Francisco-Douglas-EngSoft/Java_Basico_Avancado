/**
 * Demonstra os principais tipos de comentários usados em Java.
 *
 * @author Curso de Java
 */
public class comentarios {

    public static void main(String[] args) {
        // Comentário de linha: explica uma instrução ou uma ideia curta.
        double largura = 5.0;

        /*
         * Comentário em bloco: pode ocupar várias linhas
         * e é útil para explicações mais longas.
         */
        double altura = 3.0;

        double area = calcularArea(largura, altura);
        System.out.println("Área do retângulo: " + area);
    }

    /**
     * Calcula a área de um retângulo.
     *
     * @param largura largura do retângulo
     * @param altura altura do retângulo
     * @return área calculada pela multiplicação da largura pela altura
     */
    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }
}
