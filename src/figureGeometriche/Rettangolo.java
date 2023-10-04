package figureGeometriche;

public class Rettangolo {
    public float base;
    public float altezza;
    
    public Rettangolo(float b, float h){
        base = b;
        altezza = h;
    }
    public float area(){
        float area;
        area = base * altezza;
        return area;
    }
    public float perimetro(){
        float perimetro;
        perimetro = (2*base) + (2*altezza);
        return perimetro;
    }
}