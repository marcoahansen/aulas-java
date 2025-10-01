package aula4;
import javax.swing.JOptionPane;
/*
 * Crie a classe BoletimEscolar, um sistema para gerenciar as notas da turma.
 * Utilizando JOptionPane para uma interface mais interativa, o programa deve solicitar as 4 notas 
 * bimestrais para 3 alunos diferentes,armazenando tudo em uma matriz 3x4.
 * Os prompts de entrada devem ser claros (ex: "Digite a 2ª nota do Aluno 1").
 * Ao final do preenchimento, o sistema deve calcular a média final de cada aluno (a média de cada linha 
 * da matriz) e exibir um relatório único com o resultado de todos.
 */
public class BoletimEscolar {
    public static void main(String[] args) {
        double[][] turma = new double[3][4];
        double[] medias = new double[3];
        double soma = 0;
        JOptionPane.showMessageDialog(null, "Boletim escolar! Digite a seguir as notas bimestrais dos alunos. ");
        for(int i =0; i < turma.length; i++){
            for(int j=0; j < turma[i].length; j++){
                String mensagem = String.format("Digite a %dª nota do Aluno %d", j+1, i+1);
                turma[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));
                soma += turma[i][j];
            }
            medias[i] = soma/turma[i].length;
            soma = 0;
        }
        String mensagemFinal = "Resultado final da turma\n";
        for(int i = 0; i < medias.length; i++){
            mensagemFinal +=  i+1 + "º Aluno - média: " + String.format("%.2f",medias[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}
