/*
 * 4. Criar uma nova classe com o nome VerificadorDiaDaSemana. Crie uma variável diaDaSemana com um número de 1 a 7 (ex: 4). Use a estrutura switch-case para determinar se o número corresponde a um "Dia útil" (2 a 6) ou "Fim de semana" (1 e 7) e exiba o resultado.
 */
public class VerificarDiaSemana {
    public static void main(String[] args) {
        int diaDaSemana = 6;
        switch (diaDaSemana) {
            case 1,7:
                System.out.println("Fim de semana");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
