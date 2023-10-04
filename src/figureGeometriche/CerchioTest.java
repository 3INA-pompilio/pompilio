package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float r;
        float area;
        float circonferenza;
        
        System.out.print("Inserire il raggio : ");
        r = in.nextFloat();
        
        Cerchio cerchio = new Cerchio(r);
        
        r = cerchio.raggio;
        area = cerchio.area();
        circonferenza = cerchio.circonferenza();
        
        System.out.println("raggio :       " + r);
        System.out.println("area :         " + area);
        System.out.println("circonferenza: " + circonferenza);
        
    }
    
}