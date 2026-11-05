package metodos;

public class empresa {
    private String nome;
    private double salario;

    public empresa(String nomeInit, double salarioInit) {
        if (nomeInit == null || nomeInit.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio.");
        }
        if (salarioInit < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }

        this.nome = nomeInit;
        this.salario = salarioInit;
    }

    public String exibirInformacoes() {
        return String.format("Nome: %s | Salario: %.2f", this.nome, this.salario);
    }
}
