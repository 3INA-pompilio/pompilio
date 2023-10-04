package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double l;
        double area;
        double perimetro;
        
        System.out.print("Inserire il valore del lato : ");
        l = in.nextDouble();
        
        Quadrato quadrato = new Quadrato(l);
        
        l = quadrato.l;
        area = quadrato.esegui();
        perimetro = quadrato.perimetro();
        
        System.out.println("lato : " + l);
        System.out.println("area : " + area);
        System.out.println("perimetro : " + perimetro);
    }    

}