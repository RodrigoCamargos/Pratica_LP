package br.com.newton;

public class Acai {
   private int tamanho;
    private double valor;
    private boolean acrescimo;

    public Acai(double valor, boolean acrescimo) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.acrescimo = acrescimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;

        int total=0;

        switch(total){
            case 1: valor = 8;
            break;
            case 2: valor = 10;
            break;
            case 3: valor = 12;
            break;

        }
    }

    public boolean isAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(boolean acrescimo) {
        this.acrescimo = acrescimo;
    }



    public void TaxaAcrescimo(double taxa){

        valor = valor + taxa;

    }


}
