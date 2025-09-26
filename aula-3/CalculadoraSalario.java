/*
 * 2) Crie uma classe com o nome CalculadoraSalario defina uma variável com o nome, salário, inicialize a variável com algum valor e exiba no console o valor do salário com desconto do INSS.
 * até 1.751,81 descontará 8%/ entre 1.751,82 até 2.919,72 descontará 9%
 * entre 2.919,73 até 5.839,45 descontará 10%; Acima 5.839,45 descontará 11%
 */
public class CalculadoraSalario {
    public static void main(String[] args) {
        double salario = 1600.74;
        double salarioComDesconto;
        if(salario <= 1751.81){
            salarioComDesconto = salario - (salario * 8/100);
        } else if(salario <= 2919.72){
            salarioComDesconto = salario - (salario * 9/100);
        } else if(salario <= 5839.45){
            salarioComDesconto = salario - (salario * 10/100);
        } else {
            salarioComDesconto = salario - (salario * 11/100);
        }
        System.out.printf("Seu salário é %.2f e depois do desconto do INSS fica: %.2f ", salario, salarioComDesconto);
    }
}
