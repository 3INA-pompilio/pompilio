package operazioniMatematiche;

import java.util.Scanner;

public class DivisioneTest {
	
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	
	    int n1;
	    int n2;
	    int quoziente;
	
	    System.out.print("Inserire il primo numero ");
	    n1 = in.nextInt();
	    System.out.print("Inserire il secondo numero");
	    n2 = in.nextInt();
	
	    Divisione divisione = new Divisione(n1,n2);
	    n1 = divisione.n1;
	    n2 = divisione.n2;
	    quoziente = divisione.esegui();
	
	System.out.println("numero1 : " + n1);
        System.out.println("numero2 : " + n2);
        System.out.println("quoziente : " + quoziente);
    }
    
}
