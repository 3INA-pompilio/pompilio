package operazioniMatematiche;

public class Moltiplicazione {

    public double n1;
    public double n2;
    
    public Moltiplicazione(double numero1,double numero2){
        n1 = numero1;
        n2 = numero2;
    }
    

    public double esegui(){
        double prodotto;
        prodotto = n1 * n2;
        return prodotto;
    }
}
