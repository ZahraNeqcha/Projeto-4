import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
      
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque:"));

        Produto produto = new Produto(nome, preco, quantidade);

        String mensagem = "Produto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade: "
                + produto.getQuantidade();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
