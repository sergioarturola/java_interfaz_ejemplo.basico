package paquete;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		IFigura figura = null;
		
		System.out.println("Dibujar 1.- Circulo 2.- Triangulo");
		int op = teclado.nextInt();
		if(op == 1) figura = new Circulo();	
		if(op == 2) figura = new Rectangulo();
		
		figura.dibujarFigura();

	}

}


