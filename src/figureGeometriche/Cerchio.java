package figureGeometriche;

public class Cerchio {   
    
    public float raggio;
    
    public Cerchio(float r) {
        raggio = r;
    }
    public area(){
        float area;
        area = (raggio * raggio) * 3.14f;
        return area;
    }
    public circonferenza(){
        float circonferenza;
        circonferenza = (2 * raggio) * 3.14f;
        return circonferenza;
    }
    
}