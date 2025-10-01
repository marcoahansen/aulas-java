package aula4;
/*
 * Construa uma classe MontadorDeGrid que permita ao usuário preencher um grid numérico de 3x3.
 * O programa deve usar laços aninhados e Scanner para solicitar um número para cada célula da matriz. 
 * Após o preenchimento completo, exiba a matriz no console,
 * formatada como uma grade com colunas bem alinhadas.
 */

import java.util.Scanner;
public class MontadorGrid {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] grid = new int[3][3];
    for(int i = 0; i < grid.length; i++){
        for(int j= 0; j<grid[i].length; j++){
            System.out.printf("Digite o número para a posição [%d][%d] do grid: ",i,j);
            grid[i][j] = sc.nextInt();
        }
    }
    for(int i = 0; i < grid.length; i++){
        for(int j= 0; j<grid[i].length; j++){
            System.out.printf("%d | \t",grid[i][j]);
        }
        System.out.println();
    }
    sc.close();
 }   
}
