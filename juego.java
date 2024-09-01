import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class juego {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);

		System.out.println("***PIEDRA PAPEL O TIJERA***\n");

		System.out.println("[P]iedra, [Pa]pel, [T]ijeras");
		String[] opciones = {"P", "Pa", "T"};
		//List<String> listOpciones = Arrays.asList(opciones);
		
		int pcEleccion = aleatorio.nextInt(opciones.length);
		String respuesta = opciones[pcEleccion];
		System.out.println(respuesta);

		while (true) {

			System.out.print("elige una de las opciones: ");
			String eleccion = teclado.nextLine();
			
			if (opciones.contains(eleccion)) {

				System.out.println("\nSolo las opciones mostradas en pantalla\n");
				continue;	

			}
			
			System.out.println("Hola");

		}

		

	}

}
