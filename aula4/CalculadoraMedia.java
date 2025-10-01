package aula4;

import java.util.Scanner;

/*
 * Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno.
 * Utilizando Scanner, o programa deve solicitar as 4 notas bimestrais,
 * armazenando-as em um vetor de double. Após a inserção de todas as notas
 * calcule a média final e exiba o resultado formatado com duas casas decimais.
 */
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        System.out.println("--- Notas Bimestrais ---");
        for(int i=0; i< notas.length; i++){
            System.out.printf("Digite a %dª nota: ", i+1);
            notas[i] = sc.nextDouble();
            soma+=notas[i];
        }
        System.out.printf("A média final do bimestre é: %.2f", soma/notas.length);
        sc.close();
    }
}
