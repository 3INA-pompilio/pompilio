package figureGeometriche;

public class TriangoloScaleno {
	public float l1;
	public float l2;
	public float l3;
	
	public TriangoloScaleno (float l1, float l2, float l3){
		l1 = l1;
		l2 = l2;
		l3 = l3;
	}
	public float semiPerimetro(){
		float semiPerimetro;
		semiPerimetro = (l1+ l2 + l3)/2;
		return semiPerimetro;
	}
	public float area(){
		float area;
                float sP = semiPerimetro();
		area = float.Math.sqrt(sP*(sP-l1)*(sP-l2)*(sP-l3));
		return area;
	}
}