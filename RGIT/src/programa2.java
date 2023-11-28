
import java.util.Scanner;

public class programa2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Introduce el primer número entero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Introduce el segundo número entero (distinto del primero): ");
	        int numero2 = scanner.nextInt();

	        while (numero1 == numero2) {
	            System.out.println("Los números deben ser distintos. Vuelve a introducir el segundo número.");
	            System.out.print("Introduce el segundo número entero (distinto del primero): ");
	            numero2 = scanner.nextInt();
	        }

	        System.out.print("Introduce el tercer número entero: ");
	        int numero3 = scanner.nextInt();

	        System.out.println("Números entre " + numero1 + " y " + numero2 + " con incremento de 7:");

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        for (int i = menor; i <= mayor; i += 7) {
	            System.out.print(i + " ");
	        }

	        if (numero3 >= menor && numero3 <= mayor) {
	            System.out.println("El tercer número (" + numero3 + ") está entre el primer y segundo número.");
	        }

	        scanner.close();
	    }
	}