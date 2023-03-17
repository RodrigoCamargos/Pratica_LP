public class Hamburguer {

    public String nome;
    public double valor;
    public boolean artesanal;

    public double calculaacrescimo(boolean artesanal){
        if(artesanal==true){
            return valor + 8.00;
        }
        return valor;
    }
    public String getNome(){
        return nome;
    }
}
