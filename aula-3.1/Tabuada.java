/*
 * Crie uma classe Tabuada. Declare uma variável numero e atribua um valor.
 * Use um laço for para imprimir a tabuada desse número de 1 a 10.
 */
public class Tabuada {
    public static void main(String[] args) {
        int numero = 5;
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "="+ numero*i);
        }
    }
}