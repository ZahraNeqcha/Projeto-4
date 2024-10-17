import javax.swing.JOptionPane;

public class TesteDisciplina {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Nome da disciplina:");
    String professor = JOptionPane.showInputDialog("Nome do professor:");
    int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre da disciplina:"));
    boolean ofertada = Boolean
        .parseBoolean(JOptionPane.showInputDialog("A disciplina está sendo ofertada? true/false"));
    Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

    String mensagem = "Disciplina: " + disciplina.getNome() + "\nProfessor: " + disciplina.getProfessor()
        + "\nSemestre: " + disciplina.getSemestre() + "\nOfertada: " + (disciplina.isOfertada() ? "Sim" : "Não");
    JOptionPane.showMessageDialog(null, mensagem);
  }
}
