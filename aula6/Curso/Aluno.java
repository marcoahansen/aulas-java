package Curso;
public class Aluno {
    String nome;
    int matricula;
    double notaFinal;

    // Um método (comportamento) do Aluno
    void verificarAprovacao() {
        if (notaFinal >= 7.0) {
            System.out.println(nome + " está APROVADO(A)!");
        } else {
            System.out.println(nome + " está em RECUPERAÇÃO.");
        }
    }
}