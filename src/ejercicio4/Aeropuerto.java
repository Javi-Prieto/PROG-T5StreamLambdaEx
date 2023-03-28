package ejercicio4;

import java.util.List;

public class Aeropuerto {
	//Fields
	private List<Vuelo> lista;
	//Constructor

	public Aeropuerto(List<Vuelo> lista) {
		super();
		this.lista = lista;
	}
	//toString

	@Override
	public String toString() {
		return "Aeropuerto [lista=" + lista + "]";
	}
	//Methods
	public LocalTime calcularFechaLlegada() {
		
	}
}
