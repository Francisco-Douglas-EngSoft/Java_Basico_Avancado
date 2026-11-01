public class loopFor {
    public static void main(String[] args) {
        // Estrutura: for (inicializacao; condicao; atualizacao) { codigo }
        //
        // 1. A inicializacao acontece uma unica vez, antes do primeiro teste.
        // 2. A condicao e verificada antes de cada repeticao. Se for falsa,
        //    o loop termina.
        // 3. O bloco entre chaves e executado quando a condicao e verdadeira.
        // 4. A atualizacao acontece depois do bloco; em seguida, a condicao
        //    e testada novamente.
        //
        // Neste exemplo, i comeca em 0, aumenta de 1 em 1 e o loop termina
        // quando i deixa de ser menor que 10. Portanto, sao impressos 0 a 9.
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i e: " + i);
        }
    }

    // O for e indicado quando sabemos ou conseguimos definir uma condicao
    // para controlar as repeticoes, como contar, percorrer indices ou
    // executar uma tarefa um numero determinado de vezes.
    //
    // Cuidado: se a variavel de controle nao for atualizada de forma que a
    // condicao eventualmente se torne falsa, o loop pode nunca terminar.
}
