import java.util.Scanner;
public class MediaNotas {
   public static void main(String[] args) {
    double nota, soma = 0;
    int cont = 0;
    Scanner sc = new Scanner(System.in);
    for(int i = 1; i <= 5; i++){
        System.out.println("Digite a " + i + "ª nota: ");
        nota = sc.nextDouble();
        if(nota > 10){
            continue;
        } else if (nota < 0){
            break;
        }
        soma += nota;
        cont++;
    }
    System.out.printf("A média das notas válidas é: %.2f", soma/cont);
    sc.close();
   } 
}
