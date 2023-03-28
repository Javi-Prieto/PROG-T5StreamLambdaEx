package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {
	public static void main(String [] args) {
		String  nomCur;
		int op=1;
		char let;
		Secretaria se;
		
		List <Alumno> listaAl = new ArrayList<Alumno>();
		listaAl.add(null);
		listaAl.add(new Alumno("Juan", "Lope", "1DAM", 9.8, 16));
		listaAl.add(new Alumno("Alvaro", "Marq", "1AyF", 4.8, 19));
		listaAl.add(new Alumno("Juan Francisco", "Cualicre", "1FPB", 9.2, 21));
		listaAl.add(new Alumno("Paco", "Cancile", "1DAM", 5.6, 25));
		listaAl.add(new Alumno("Ale", "Solea", "1DAM", 9.2, 19));
		listaAl.add(new Alumno("Pepe", "Sou", "1AyF", 2.1, 25));
		listaAl.add(new Alumno("Ana", "Astaris", "1DAM", 9.6, 26));
		se = new Secretaria(listaAl);
		do {
			try {
				System.out.println("---------------------MENU---------------------");
				System.out.println("1. Mostrar Alumnos 1 clase");
				System.out.println("2. Mostrar Todos los Alumnos");
				System.out.println("3. Mostrar Alumnos que comiezan por letra");
				System.out.println("4. Mostrar cantidad Alumnos");
				System.out.println("5. Mostrar alumnos 1DAM con más de 9 media");
				System.out.println("6. Mostrar los 3 primeros alumnos");
				System.out.println("7. Mostrar alumno de menor edad");
				System.out.println("8. Mostrar primer alumno");
				System.out.println("9. Mostrar alumnos con nombre con más de 10 letra");
				System.out.println("10. Mostrar alumons con nombre menor de 6 letras y que empieza por A");
				System.out.println("0. Salir");
				System.out.println("----------------------------------------------");
				System.out.println("¿Qué desea hacer?");
				op = Leer.datoInt();
				switch (op) {
					case 1:
						System.out.println("Diga el nombre de un curso");
						nomCur = Leer.dato();
						se.mostrarTodosAlumnosCurso(nomCur);
						break;
					case 2:
						se.mostrarTodosAlumnos();
						break;
					case 3:
						System.out.println("Diga la letra a buscar en mayúsculas");
						let = Leer.datoChar();
						se.mostrarAlumnosPorLetraNombre(let);
						break;
					case 4:
						se.imprimirLongitudLista();
						break;
					case 5:
						se.mostrarAlumnosDAM();
						break;
					case 6:
						se.mostrar3PrimerosAl();
						break;
					case 7:
						se.mostrarAlumnoMenorEdad();
						break;
					case 8:
						se.mostrarPrimerAlumnoLista();
						break;
					case 9:
						se.mostrarAlumnosNombreLargo();
						break;
					case 10:
						se.mostrarAlumnosLetraA();
						break;
					case 0:
						System.out.println("Gracias por usar el programa");
						break;
					default:
						System.out.println("Numero incorrecto");
				}
			}catch(NumberFormatException e) {
				System.err.println("Error: Esta usted intentando introducir un valor incorrecto");
			}catch(Exception e) {
				System.err.println("Error: Error desconocido, estamos trabajando en ello");
			}
		}while(op != 0);
	}
}
