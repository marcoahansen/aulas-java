package aula5_1.SistemaEscolar;

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
       Aluno[] turma = new Aluno[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < turma.length; i++){
            turma[i] = new Aluno();
            System.out.printf("Digite o nome do %dº Aluno: ", i+1);
            turma[i].nome = sc.next();
            System.out.printf("Digite a matricula do %dº Aluno: ", i+1);
            turma[i].matricula = sc.nextInt();
            System.out.printf("Digite a nota do %dº Aluno: ", i+1);
            turma[i].nota = sc.nextDouble();
        }
        for(int i = 0; i < turma.length; i++){
            System.out.printf("Dados do %dº Aluno são:\nNome: %s \nMatricula: %d \nNota: %.2f\n", i+1, turma[i].nome, turma[i].matricula, turma[i].nota);
        }
        sc.close(); 
    }
}
