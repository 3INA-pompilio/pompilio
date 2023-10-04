package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float base;
        float altezza;
        float area;
        float perimetro;
        
        System.out.print("Inserire il valore della base   :");
        base = in.nextFloat();
        System.out.print("Inserire il valore dell'altezza :");
        altezza = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo(base, altezza);
        
        base = rettangolo.base;
        altezza = rettangolo.altezza;
        area = rettangolo.area();
        perimetro = rettangolo.perimetro();
        
        System.out.println("base      : " + base);
        System.out.println("altezza   : " + altezza);
        System.out.println("area      : " + area);
        System.out.println("perimetro : " + perimetro);
        
    }
    
}