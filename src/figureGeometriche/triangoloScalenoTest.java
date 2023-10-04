package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l1;
        float l2;
        float l3;
        float semiPerimetro;
        float area;
        
        System.out.print("Inserire il primo valore : ");
        l1 = in.nextFloat();
        System.out.print("Inserire il primo valore : ");
        l2 = in.nextFloat();
        System.out.print("Inserire il primo valore : ");
        l3 = in.nextFloat();
        
        TriangoloScaleno triangoloScaleno = new TriangoloScaleno(l1,l2,l3);
        
        l1 = triangoloScaleno.l1;
        l2 = triangoloScaleno.l2;
        l3 = triangoloScaleno.l3;
        semiPerimetro = triangoloScaleno.semiPerimetro();
        area = triangoloScaleno.area();
        
        System.out.println("lato 1 : " + l1);
        System.out.println("lato 2 : " + l2);
        System.out.println("lato 3 : " + l3);
        System.out.println("perimetro : " + semiPerimetro*2);
        System.out.println("area : " + area);
        
    }
    
}