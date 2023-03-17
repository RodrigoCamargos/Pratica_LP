public class Pizza {

    public String nome;
    public Double valor;
    public boolean possuiBorda;

    public double CalcularValor(boolean possuiBorda){

        if (possuiBorda){
            return valor + 5.00;
        }
        return valor;
    }
         public String getNome(){
        return nome;
         }
}
