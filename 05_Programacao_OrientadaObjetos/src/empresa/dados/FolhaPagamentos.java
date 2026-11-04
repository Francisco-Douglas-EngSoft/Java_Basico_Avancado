package empresa.dados;

public class FolhaPagamentos {

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("João", 2000.00);
        Funcionarios funcionario2 = new Funcionarios("Maria", 2500.00);

        System.out.println("Folha de Pagamentos:");
        System.out.println("Funcionário: " + funcionario1.nome + ", Salário: R$" + funcionario1.salario);
        System.out.println("Funcionário: " + funcionario2.nome + ", Salário: R$" + funcionario2.salario);
    }

}
