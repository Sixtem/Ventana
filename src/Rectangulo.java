
public class Rectangulo {
	
	private int ancho;
	private int alto;
	
	public Rectangulo(){
		this.ancho = 5;
		alto = 3;
	}
	
	public void area(){
		System.out.print("Area del rectangulo");
	}
	
	public void perimetro(){
		int area = ancho * alto;
		System.out.print(area);
	}

}
