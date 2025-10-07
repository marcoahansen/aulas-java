package TimeDeFutebol;

import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TimeDeFutebol tabajara = new TimeDeFutebol("Tabajara FC");
    String nome, posicao;
    int tamanho = 3;

    for(int i = 0; i < tamanho; i++){
       System.out.printf("Digte o nome do %dª jogador: ", i+1);
        nome = sc.nextLine();
        System.out.printf("Digte o posição do %dª jogador: ", i+1); 
        posicao = sc.nextLine();
        Jogador jogador = new Jogador(nome, posicao);
        tabajara.contratarJogador(jogador);
    }

    tabajara.exibirEscalacao();
    sc.close();
   }
}
