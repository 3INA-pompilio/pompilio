package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double n1;
        double n2;
        double prodotto;
        
        System.out.print("Inserire il primo numero : ");
        n1 = in.nextDouble();
        
        System.out.print("Inserire il secondo numero : ");
        n2 = in.nextDouble();
        
        Moltiplicazione moltiplicazione = new Moltiplicazione(n1,n2);
        
        n1 = moltiplicazione.n1;
        n2 = moltiplicazione.n2;
        prodotto = moltiplicazione.esegui();
        
        System.out.println("numero1 : " + n1);
        System.out.println("numero2 : " + n2);
        System.out.println("prodotto : " + prodotto);
        
    }
    
}

