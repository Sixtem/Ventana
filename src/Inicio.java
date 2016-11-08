import vista.Principal;
import formulas.Area;

public class Inicio {
	
	public static void main(String[] args){
		System.out.print("hola mundo");
		new Triangulo().perimetro();
		new Principal();
		new Area().triangulo();
	}
	
	public static void impar(int num){
		if(num%2==1)
			System.out.print("impar");
			
	}
	
	public static void par(int numero){
		if(numero%2==0){
			System.out.print("Es par");
		}
	}


}
