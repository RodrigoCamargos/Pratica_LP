package br.com.newton;

import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {

        double valor = 0;
        boolean acrescimo = false;
        int taxa =2;
        double total = 0;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho desejado: \n1- Tamanho = 300 \n2-Tamanho = 500 \n3-Tamanho = 700 \n4-Sair "));



        switch (opcao){
            case 1:
                valor=8;
            break;
            case 2:
                valor= 10;
            break;
            case 3:
                valor= 12;
            break;
            default: JOptionPane.showInputDialog("Opção invalida");

        }
        
        String acrescimoDeSoverte = JOptionPane.showInputDialog("Deseja Acrescimo de sorvete?  1-Sim \n 2=Não");
        boolean acrecismoDeSorverteParaCalculo;

        if (acrescimoDeSoverte.equals("1")) {
            acrecismoDeSorverteParaCalculo = true;
             total = (valor + 2);
            JOptionPane.showInputDialog(null, "O seu açaí ficou no valor de: " + total, JOptionPane.INFORMATION_MESSAGE);
        } else {
            acrecismoDeSorverteParaCalculo = false;
            JOptionPane.showInputDialog(null, "O seu açaí ficou no valor de: " + valor, JOptionPane.INFORMATION_MESSAGE);
        }
        }

    }
