import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
      
        String nome = JOptionPane.showInputDialog("Nome da turma:");
        String curso = JOptionPane.showInputDialog("Curso da turma:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Série:"));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        String mensagem = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
                + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, mensagem);

  
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);

      
        mensagem = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
                + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
