package empresa;
import empresa.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario("João", 3000.00);
        Funcionario funcionario2 = new Funcionario("Maria", 4000.00);

        System.out.println("Funcionário 1: " + funcionario1.nome + ", Salário: " + funcionario1.salario);
        System.out.println("Funcionário 2: " + funcionario2.nome + ", Salário: " + funcionario2.salario);
    }
}
