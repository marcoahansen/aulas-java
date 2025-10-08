package aula7.Ordenador;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {30,18,55,77,2,5};

        Ordenador.selectionSort(vetor);

        for(int i =0; i<vetor.length; i++){
            System.out.printf("%d - %d\n",i,vetor[i]);
        }
    }
}
