package aula7.Ordenador;

public class Ordenador {
    public static void bubbleSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n-1; i++){
            System.out.printf("Posição i: %d \n", i);
            for(int j=0; j < n-i-1; j++){
                System.out.printf("item na posição %d é %d e item na posição %d é %d \n", j, vetor[j], j+1, vetor[j+1]);
                if(vetor[j]>vetor[j+1]){
                    int temp = vetor[j];
                    vetor[j]= vetor[j+1];
                    vetor[j+1]=temp;
                    System.out.printf("----- Trocou----- \nitem na posição %d é %d e item na posição %d é %d \n", j, vetor[j], j+1, vetor[j+1]);
                }
            }
        }
    }

    public static void selectionSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i<n -1; i++){
            System.out.printf("Posição i: %d \n", i);
            int indiceDoMenor = i;
            for(int j = i+1; j<n;j++){
                if(vetor[j]< vetor[indiceDoMenor]){
                    System.out.printf("O número selecionado (j) é o %d - %d o numero no indiceDoMenor é %d - %d\n", j,vetor[j], indiceDoMenor, vetor[indiceDoMenor]);
                    indiceDoMenor = j;
                }
            }
            int temp = vetor[indiceDoMenor];
            vetor[indiceDoMenor] = vetor[i];
            vetor[i] = temp;
            System.out.printf("temp %d - vetor[indiceDoMenor] %d -  vetor[i] %d \n", temp, vetor[indiceDoMenor], vetor[i]);
        }
    }

    public static void insertionSort(int[] vetor){
        for(int i= 1; i< vetor.length; i++){
            int chave = vetor[i];
            System.out.println("Essa é a chave " + chave);
            int j = i -1;
            while (j >=0 && vetor[j]>chave){
               System.out.printf("Substituiu o vetor[%d] - %d pelo vetor[%d] - %d\n",j+1, vetor[j+1], j, vetor[j]);
               vetor[j+1] = vetor[j];
               j = j - 1; 
            }
            vetor[j+1] = chave;
        }
    }
}

