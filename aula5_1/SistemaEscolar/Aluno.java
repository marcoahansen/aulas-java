package aula5_1.SistemaEscolar;
public class Aluno {
    // Atributos (os campos do nosso "registro")
    String nome;
    int matricula;
    double nota;
    // Um método (comportamento) do Aluno
    void verificarAprovacao() {
        if (nota >= 7.0) {
            System.out.println(nome + " está APROVADO(A)!");
        } else {
            System.out.println(nome + " está em RECUPERAÇÃO.");
        }
    }
    void mostrarDados(int num){
        System.out.printf("Dados do %dº Aluno são:\nNome: %s \nMatricula: %d \nNota: %.2f\n", num, nome, matricula, nota);
    }
}
