import java.util.*;
public class Ejercicio9{
	public static void main(String[] args) {
		//inicializamos scanner y declaramos variables
		Scanner scanner = new Scanner(System.in);
		double contador, prom, suma, t1, t2;
		contador= 0;
		suma = 0;
		prom = 0;
		
		//Creamos un ciclo que nos permita solicitar la informacion

		do{
			System.out.println("Ingrese la temperatura 1: ");
			t1 = scanner.nextDouble();
			System.out.println("Ingrese la temperatura 2: ");
			t2 = scanner.nextDouble();
			if (t1>4 && t1<16) {
				contador = contador+1;
				suma = suma+t1;				
			}
			if (t2>4 && t2<16) {
				contador = contador+1;
				suma = suma+t2;				
			}
		}while (t1==0);
		prom = suma/(contador);
		System.out.println("Cantidad de datos analizados: "+contador);
		System.out.println("El promedio es: "+prom);	
	}
}