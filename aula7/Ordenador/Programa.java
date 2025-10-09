package aula7.Ordenador;

import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int[] vetor = new int[tamanhoVetor];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(30) + 1;
        }
        System.out.println("### Vetor Original (20 primeiros elementos) ###");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("\n---------------------------------------");
        
        Ordenador.insertionSort(vetor);

        for(int i =0; i<vetor.length; i++){
            System.out.printf("%d - %d\n",i,vetor[i]);
        }
    }
}
