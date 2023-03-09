package br.com.newton.main;
import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {


        String nome;
        String numTelefone;
        int totalNum=0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome para contato: ");
        nome = ler.next();


        System.out.println("Informe o telfone de contato: ");
        numTelefone = ler.next();

        int totalCharacters = 0;
        char temp ;
        for (int i = 0; i < numTelefone.length(); i++) {
            temp = numTelefone.charAt(i);
            totalCharacters++;
        }
        if (totalCharacters==9)
            System.out.println("Telefone valido" );
        else
            System.out.println("Telefone invalido");

    }

}