import java.awt.Container;
import java.io.Serial;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;


public class Main extends JFrame {
    @Serial private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        Main field = new Main();
        field.testaAluguelDeVeiculos();
    } // Fecha main

    private void testaAluguelDeVeiculos () {

        Container janela = getContentPane(); // CRIADO O CONTAINER JANELA
        setLayout(null);

        //COMANDOS DA CLASSE JLABEL - ROTULOS DE TEXTO

        //Rotulo de título
        JLabel labelAluguelDeVeiculos = new JLabel("Aluguel de Veículos");
        JLabel labelDadosDoCliente = new JLabel("Dados do Cliente:");
        JLabel labelDadosDoCarro = new JLabel("Dados do Carro:");


        //Rotulo do cliente
        JLabel labelNomeCliente = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");


        //Rotulo do carro
        JLabel labelNomeCarro = new JLabel("Nome: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDataLocacao = new JLabel("Data de Locacao: ");
        JLabel labelDataEntrega = new JLabel("Data de Entrega: ");


        // Definicao das mascaras
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;

        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDataLocacao = null;
        MaskFormatter mascaraDataEntrega = null;

        try{
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("+##-##-#########");
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');

            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraDataLocacao = new MaskFormatter("##/##/####");
            mascaraDataEntrega = new MaskFormatter("##/##/####");
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDataLocacao.setPlaceholderCharacter('_');
            mascaraDataEntrega.setPlaceholderCharacter('_');
        }

        catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos
        JFormattedTextField jFormattedTextNomeCliente = new JFormattedTextField();
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextNomeCarro = new JFormattedTextField();
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDataLocacao = new JFormattedTextField(mascaraDataLocacao);
        JFormattedTextField jFormattedTextDataEntrega = new JFormattedTextField(mascaraDataEntrega);

        // Botao Salvar

        JButton JButtonbotaoSalvar = new JButton();
        JButtonbotaoSalvar.setText("SALVAR");



        // SetBounds para localizacao dos itens (x,y) e tamanho (w,h)

        //Labels - Rotulos de Texto
        labelAluguelDeVeiculos.setBounds(50,10,200,20);
        labelDadosDoCliente.setBounds(50,50, 200, 20);
        labelNomeCliente.setBounds(50,80,100,20);
        labelCpf.setBounds(50,110,100,20);
        labelTel.setBounds(50,140,100,20);
        labelDadosDoCarro.setBounds(50,200,200,20);
        labelNomeCarro.setBounds(50,230,100,20);
        labelPlaca.setBounds(50,260,100,20);
        labelAno.setBounds(50,290,100,20);
        labelDataLocacao.setBounds(50,320,100,20);
        labelDataEntrega.setBounds(50,350,100,20);

        //JFormattedTexts - Espacos para preencher
        jFormattedTextNomeCliente.setBounds(180,80,150,20);
        jFormattedTextCpf.setBounds(180,110,90,20);
        jFormattedTextTel.setBounds(180,140,120,20);
        jFormattedTextNomeCarro.setBounds(180,230,150,20);
        jFormattedTextPlaca.setBounds(180,260,60,20);
        jFormattedTextAno.setBounds(180,290,40,20);
        jFormattedTextDataLocacao.setBounds(180,320,80,20);
        jFormattedTextDataEntrega.setBounds(180,350,80,20);

        //JButton - Botao Salvar
        JButtonbotaoSalvar.setBounds(120,400,100,20);


        //Preenchimento do Container Janela - Adiciona os rótulos e os campos de textos com máscaras no Container
        //Labels - Rotulos
        janela.add(labelAluguelDeVeiculos);
        janela.add(labelDadosDoCliente);
        janela.add(labelDadosDoCarro);
        janela.add(labelNomeCliente);
        janela.add(labelCpf);
        janela.add(labelTel);
        janela.add(labelNomeCarro);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDataEntrega);
        janela.add(labelDataLocacao);
        //JFormattedText - Espacos
        janela.add(jFormattedTextNomeCliente);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextNomeCarro);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextDataEntrega);
        janela.add(jFormattedTextDataLocacao);
        //JButton - Botao Salvar
        janela.add(JButtonbotaoSalvar);

        //Tamanho da Tela
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}