package aula11.EmbarqueV2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import aula11.Pessoa;
/*
 * Simule o processo de embarque de um micro-ônibus que preenche os assentos de trás para frente. Crie uma Fila principal com 7 objetos Pessoa esperando. O veículo tem capacidade para 4 pessoas por vez. Para simular o embarque, você deve retirar as 4 primeiras pessoas da Fila (com dequeue()) e, uma a uma, adicioná-las a uma Pilha (com push()), que representa a área de entrada. Por fim, esvazie a Pilha (com pop()) para "sentar" as pessoas no ônibus, mostrando que a última pessoa a sair da fila foi, na verdade, a primeira a embarcar no veículo.
 */

public class Embarque {
    public static void main(String[] args) {
        Queue<Pessoa> filaDeEntrada = new ArrayDeque<>();
        Deque<Pessoa> areaDeEmbarque = new ArrayDeque<>();
        filaDeEntrada.offer(new Pessoa("Luis", 28));
        filaDeEntrada.offer(new Pessoa("David", 27));
        filaDeEntrada.offer(new Pessoa("Marco", 65));
        filaDeEntrada.offer(new Pessoa("José", 70));
        filaDeEntrada.offer(new Pessoa("Pedro", 20));
        filaDeEntrada.offer(new Pessoa("Thais", 20));
        filaDeEntrada.offer(new Pessoa("Andressa", 25));
        while(!filaDeEntrada.isEmpty()){
            System.out.println("Próxima viagem com 4 passageiros");
            for(int i = 0; i < 4 && !filaDeEntrada.isEmpty(); i++){
                System.out.println("A pessoa " + filaDeEntrada.peek().getNome() + " está embarcando");
                Pessoa p = filaDeEntrada.poll();
                areaDeEmbarque.push(p);
            }
            System.out.println("Passageiros entrando e sentando de trás para a frente");
            while (!areaDeEmbarque.isEmpty()) {
                Pessoa p = areaDeEmbarque.pop();
                System.out.println("A pessoa " + p.getNome() + " sentou no ônibus");
            }
            System.out.println("Embarque concluído");
        }
        
    }
}
