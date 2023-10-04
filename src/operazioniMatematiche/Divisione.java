package operazioniMatematiche;

public class Divisione {

    public int n1;
    public int n2;
    
    public Divisione(int numero1, int numero2){
        n1 = numero1;
        n2 = numero2;
    }
    public int esegui(){
        int quoziente;
        quoziente = n1 / n2;
        return quoziente;
    }
    
}

