package Curso;
public class Curso {
    String nomeDoCurso;
    String sigla;
    Aluno[] alunosMatriculados;
    int vagasOcupadas = 0; // Para controlar o preenchimento do vetor

    // Construtor para inicializar o curso com um número de vagas
    public Curso(String nome, int totalVagas) {
        this.nomeDoCurso = nome;
        this.alunosMatriculados = new Aluno[totalVagas];
    }

    // Método para matricular um aluno
    public void matricular(Aluno novoAluno) {
        if (vagasOcupadas < alunosMatriculados.length) {
            alunosMatriculados[vagasOcupadas] = novoAluno;
            vagasOcupadas++;
            System.out.println("Matrícula de " + novoAluno.nome + " realizada!");
        } else {
            System.out.println("Não há vagas disponíveis!");
        }
    }
}

