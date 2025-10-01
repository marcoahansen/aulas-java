package aula4;
import java.util.Scanner;
/*
 * Crie uma classe MaiorNumero que analise um conjunto de pontuações.
 * Peça ao usuário para inserir 6 números inteiros, que podem representar pontuações
 * de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor,
 * processe os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado.
 */
public class MaiorNumero {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] pontos = new int[6];
    int maior = pontos[0];
    System.out.println("Digite os pontos para descobrirmos o maior: ");
    for(int i =0; i<pontos.length;i++){
        System.out.printf("Digite a %dª pontuação: ", i+1);
        pontos[i] = sc.nextInt();
        if(pontos[i]>maior){
            maior = pontos[i];
        }
    }
    System.out.printf("A maior pontuação digitada foi %d", maior);
    sc.close();
   }
}
