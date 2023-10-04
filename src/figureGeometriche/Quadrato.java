package figureGeometriche;

public class Quadrato {
	
    public double l;
    
	
    public Quadrato(double lato){
        l = lato;
    }
    
    public double esegui(){
    	double area;
        area = l * l;
        return area;
        
    }
    
    public double perimetro(){
        double perimetro;
        perimetro = l * 4;
        return perimetro;
    }
    
}
