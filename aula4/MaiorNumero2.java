package aula4;

import javax.swing.JOptionPane;
/*
 * Crie uma classe MaiorNumero que analise um conjunto de pontuações.
 * Peça ao usuário para inserir 6 números inteiros, que podem representar pontuações
 * de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor,
 * processe os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado.
 */
public class MaiorNumero2 {
   public static void main(String[] args) {
    int[] pontos = new int[6];
    int maior = pontos[0];
    JOptionPane.showMessageDialog(null, "Digite os pontos para descobrirmos o maior: ");
    for(int i =0; i<pontos.length;i++){
        String message = String.format("Digite a %dª pontuação: ", i+1);
        pontos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message));
        if(pontos[i]>maior){
            maior = pontos[i];
        }
    }
    JOptionPane.showMessageDialog(null, "A maior pontuação digitada foi " + maior);
   }
}
