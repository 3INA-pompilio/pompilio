package operazioniMatematiche;

import java.util.Scanner;

public class SottrazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float d;
        float n1;
        float n2;

        System.out.print("Inserire il primo numero   : ");
        n1 = in.nextFloat();

        System.out.print("Inserire il secondo numero : ");
        n2 = in.nextFloat();

        Sottrazione sottrazione = new Sottrazione(n1, n2);

        n1 = sottrazione.n1;
        n2 = sottrazione.n2;
        d = sottrazione.esegui();

        System.out.println("numero1 :" + n1);
        System.out.println("numero2 :" + n2);
        System.out.printf("sottrazione : %.2f", d);
    }

}
