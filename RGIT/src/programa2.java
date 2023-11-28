
import java.util.Scanner;

public class programa2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Introduce el primer número entero: ");
		int numero1 = scanner.nextInt();

		int numero2;
		do {
			System.out.print("Introduce un segundo número entero distinto al primero: ");
			numero2 = scanner.nextInt();
			if (numero1 == numero2) {
				System.out.println("Error: El segundo número debe ser distinto al primero.");
			}
		} while (numero1 == numero2);

		
		int menor = Math.min(numero1, numero2);
		int mayor = Math.max(numero1, numero2);

		
		System.out.println("Números enteros entre " + menor + " y " + mayor + " con incremento de 7:");

		for (int i = menor; i <= mayor; i += 7) {
			System.out.println(i);
		}

		scanner.close();
	}
}