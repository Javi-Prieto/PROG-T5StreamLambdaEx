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
		.forEach(System.out::println);
	}
	public void mostrarTodosAlumnosCurso(String nombre) {
		buscarTodosLosAlumnosCurso(nombre).stream()
			.forEach(System.out::println);
	}
	public List<Alumno> buscarAlumnosPorLetraNombre(char inicial){
		return lista.stream()
				.filter(x -> x.getNombre().charAt(0) == inicial)
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
		obtenerAlumnos1DAMMedia().stream()
			.forEach(System.out::println);
	}
	
	public List<Alumno> coger3PrimerosAlumnos(){
		return lista.stream()
				.limit(3)
				.toList();
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
				.filter(x -> x.getNombre().toCharArray().length > 10)
				.toList();
	}
	public void mostrarAlumnosNombreLargo() {
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
		obtenerAlumnosLetraA().stream()
			.forEach(System.out::println);
	}
}
