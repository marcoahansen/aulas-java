/*
 * Crie uma classe chamada ListaDeCompras que funcione como um assistente pessoal.
 * O programa deve solicitar ao usuário, via Scanner, que digite 5 itens de supermercado.
 * Armazene cada item em um vetor de String e, ao final, exiba a lista completa de forma organizada no console.
 */
package aula4;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        String[] lista = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite abaixo a sua lista de compras: ");
        for(int i = 0;i<lista.length; i++){
            System.out.printf("Digite o %d item:", i +1);
            lista[i] = sc.nextLine();
        }
        System.out.println("Sua lista de compras é: ");
        for(int i = 0; i<lista.length; i++){
            System.out.printf("%d - %s \n",i+1, lista[i]);
        }
        sc.close();
    }
    
}
