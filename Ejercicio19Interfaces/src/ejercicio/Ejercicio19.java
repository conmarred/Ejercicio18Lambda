package ejercicio;

import java.util.Scanner;


interface Operaciones{
	
	public Integer operacion(Integer i, Integer j);
}


public class Ejercicio19 {

	
	public static void main(String[] args) {
		Operaciones opSuma = new Operaciones() {
			
			@Override
			public Integer operacion(Integer i, Integer j) {
				return i+j;
			}
		};
		
		Operaciones opResta = new Operaciones() {
			
			@Override
			public Integer operacion(Integer i, Integer j) {
				return i-j;
			}
		};
		
		Operaciones opMultiplicar = new Operaciones() {
			
			@Override
			public Integer operacion(Integer i, Integer j) {
				return i*j;
			}
		};
		
		Operaciones opDividir = new Operaciones() {
			
			@Override
			public Integer operacion(Integer i, Integer j) {
				return i/j;
			}
		};
		
		System.out.println("---Probando las operaciones con los par�metros---");
		System.out.println("Introduce el primer n�mero");
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo n�mero");
		numero2 = sc.nextInt();
		System.out.println("Las operaciones se realizar�n con los n�meros: " + numero1 + " y " + numero2);
		System.out.println("Resultado de la suma: ");
		System.out.println(opSuma.operacion(numero1, numero2));
		
		System.out.println("Resultado de la resta: ");
		System.out.println(opResta.operacion(numero1, numero2));
		
		System.out.println("Resultado de la multiplicaci�n: ");
		System.out.println(opMultiplicar.operacion(numero1, numero2));
		
		System.out.println("Resultado de la divisi�n: ");
		System.out.println(opDividir.operacion(numero1, numero2));
	}

}
