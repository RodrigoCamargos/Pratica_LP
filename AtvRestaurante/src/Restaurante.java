import javax.swing.JOptionPane;
import java.util.Optional;

public class Restaurante {
    public static void main(String[] args) {

        int nomeProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu pedido: (1)Hamburguer (2)Pizza (3)Sair"));
        if (nomeProd == 1) {
            JOptionPane.showInputDialog("Item Hamburguer selecionado");
            Hamburguer h = new Hamburguer();

            h.nome = JOptionPane.showInputDialog("Informe o nome do Hamburguer solicitado");
            h.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Hamburguer"));
            String artesanalDig = JOptionPane.showInputDialog("O Hamburguer possui borda? \n s - Sim \n n - Não");

            boolean artesanalCal;

            if (artesanalDig.equals("s")) {
                artesanalCal = true;
            }
            else
                artesanalCal = false;

            double valorTotal = h.calculaacrescimo(artesanalCal);
            JOptionPane.showInputDialog("Total do pedido " + valorTotal);



        } else if (nomeProd == 2) {
            JOptionPane.showInputDialog("Item Pizza selecionado");
            Pizza p = new Pizza();
            p.nome = JOptionPane.showInputDialog("Informe o nome do Hamburguer solicitado");
            p.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Hamburguer"));
            String bordaDig = JOptionPane.showInputDialog("Informe se a pizza possui borda \n s - Sim \n n - Não");

            boolean BordaCalc;

            if(bordaDig.equals("s")){
                BordaCalc = true;
            }
            else
                BordaCalc = false;
            double valorTotal = p.CalcularValor(BordaCalc);

            JOptionPane.showInputDialog("Total do pedido " + valorTotal);
        } else
            JOptionPane.showInputDialog("Obrigado pela preferencia");

    }
}
