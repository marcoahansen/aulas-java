package Escola;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Escola senai = new Escola("Curso TI", 10);
        String nome;
        int mat;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite a matricula do Aluno: ");
        mat = sc.nextInt();

        Aluno novoaAluno = new Aluno(nome, mat);
        senai.matricular(novoaAluno);
        sc.close();
    }
}
