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
		List<String> listOpciones = Arrays.asList(opciones);
		
		int pcEleccion = aleatorio.nextInt(opciones.length);
		String respuesta = opciones[pcEleccion];

		while (true) {

			System.out.print("elige una de las opciones: ");
			String eleccion = teclado.nextLine();
			
			if (!listOpciones.contains(eleccion)) {

				System.out.println("\nSolo las opciones mostradas en pantalla\n");
				continue;

			}

			System.out.println("Pc saco: " + respuesta);
			if (eleccion.equals(respuesta)) {

				System.out.println("Empate");
				break;

			}else if (eleccion.equals("P") && respuesta.equals("Pa")) {

				System.out.println("Perdiste");
				break;

			}else if (eleccion.equals("P") && respuesta.equals("T")) {

				System.out.println("Ganaste");
				break;
	
			}else if (eleccion.equals("Pa") && respuesta.equals("P")) {

				System.out.println("Ganaste");
				break;

			}else if (eleccion.equals("Pa") && respuesta.equals("T")) {

				System.out.println("Perdiste");
				break;

			}else if (eleccion.equals("T") && respuesta.equals("P")) {
			
				System.out.println("Perdiste");
				break;

			}else if (eleccion.equals("T") && respuesta.equals("Pa")) {

				System.out.println("Ganaste");
				break;

			}

		}
		
		teclado.close();

	}

}
//fue bastante gratificante hacer este programa me enseño otro enfoque para aplicar en otros lenguajes de programacion
//tambien gracias a las pruebas y error aprendi a usar un poco git porque me equivoque bastantes veces y tenia que regresar una version anterior de mi programa
//:)
