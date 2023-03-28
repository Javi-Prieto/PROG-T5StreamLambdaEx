package ejercicio1;

import java.util.List;

public class Secretaria {
	//Fields
	private List<Alumno> lista;
	//Constructor

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter
	
	public List<Alumno> getLista() {
		return lista;
	}


	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	//toString

	

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	//Methods
	public List<Alumno> buscarTodosLosAlumnosCurso(String nombre){
		return lista.stream()
				.filter(x -> x.getNombreCurso().equalsIgnoreCase(nombre))
				.toList();
	}
	public void mostrarTodosAlumnos() {
		lista.stream()
		.forEach(/*System.out::println*/a -> System.out.println(a));
	}
	public void mostrarTodosAlumnosCurso(String nombre) {
		System.out.println("Los alumnos de " + nombre + " son");
		buscarTodosLosAlumnosCurso(nombre).stream()
			.forEach(System.out::println);
	}
	public List<Alumno> buscarAlumnosPorLetraNombre(char inicial){
		return lista.stream()
				.filter(x -> x.getNombre().toUpperCase().charAt(0) == inicial)
				.toList();
	}
	public void mostrarAlumnosPorLetraNombre(char inic) {
		buscarAlumnosPorLetraNombre(inic).stream()
			.forEach(System.out::println);
	}
	public long longitudLista() {
		return lista.stream().count();
	}
	public void imprimirLongitudLista() {
		System.out.println("La longitud es: " + longitudLista());
	}
	public List<Alumno> obtenerAlumnos1DAMMedia(){
		return lista.stream()
				.filter(x -> x.getNombreCurso().equalsIgnoreCase("1DAM"))
				.filter(x -> x.getNotaMedia() > 9)
				.toList();
	}
	public void mostrarAlumnosDAM() {
		System.out.println("Todos los alumnos de DAM con más de 9 de media son: ");
		obtenerAlumnos1DAMMedia().stream()
			.forEach(System.out::println);
	}
	
	public List<Alumno> coger3PrimerosAlumnos(){
		return lista.stream()
				.limit(3)
				.toList();
	}
	public void mostrar3PrimerosAl() {
		System.out.println("Los tres primeros alumnos son: ");
		coger3PrimerosAlumnos().stream().forEach(System.out::println);
	}
	public Alumno obtenerAlumnoMenorEdad() {
		return lista.stream()
				.min((x,z) -> x.getEdad()<z.getEdad()?1:x.getEdad()>z.getEdad()?-1:0)
				.get();
	}
	public void mostrarAlumnoMenorEdad() {
		System.out.println("El alumno con menor edad es: ");
		System.out.println(obtenerAlumnoMenorEdad());
	}
	public Alumno primerAlumnoLista() {
		return lista.stream()
				.findFirst()
				.get();
	}
	public void mostrarPrimerAlumnoLista() {
		System.out.println("El primer Alumno de la lista es: ");
		System.out.println(primerAlumnoLista());
	}
	public List<Alumno> obtenerAlumnosNombreLargo(){
		return lista.stream()
				.filter(x -> x.getNombre().length() > 10)
				.toList();
	}
	public void mostrarAlumnosNombreLargo() {
		System.out.println("Los alumnos con un nombre mayor a 10 carácteres");
		obtenerAlumnosNombreLargo().stream()
			.forEach(System.out::println);
	}
	public List<Alumno> obtenerAlumnosLetraA(){
		return lista.stream()
				.filter(x -> x.getNombre().charAt(0) == 'A')
				.filter(x -> x.getNombre().toCharArray().length <= 6)
				.toList();
	}
	public void mostrarAlumnosLetraA() {
		System.out.println("Los alumnos cuyo nombre empieza por a y tienen un nombre corto son: ");
		obtenerAlumnosLetraA().stream()
			.forEach(System.out::println);
	}
}
