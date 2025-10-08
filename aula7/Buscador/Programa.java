package aula7.Buscador;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = new int[3000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 2;
        }
        int busca = 1344;
        int posicao = Buscador.buscaBinaria(vetor, busca);
        if(posicao == -1){
            System.out.println("O número não está na lista.");    
        }else{
            System.out.printf("O item buscado está na posição: %d e é o item: %d ", posicao, vetor[posicao]);
        }
    }
}
