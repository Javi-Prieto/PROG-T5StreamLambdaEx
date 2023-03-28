package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Vuelo {
	//Fields
	private String idVuelo, companyName;
	private double duracion;
	private LocalDate fechaSalida;
	private LocalTime horaSalida;
	//Constructor
	public Vuelo(String companyName, double duracion, LocalDate fechaSalida, LocalTime horaSalida) {
		super();
		this.companyName = companyName;
		this.duracion = duracion;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
	}
	//Getter and Setter
	public String getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	//toString
	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", companyName=" + companyName + ", duracion=" + duracion
				+ ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + "]";
	}
	//Method
	public int numAlAzar() {
		return  new Random().nextInt(1111, 9999);
	}
	public void establecerIdVuelo() {
		if(companyName.split(" ").length > 1) {
				String [] names = companyName.split(" ");
				idVuelo = names[0].toUpperCase()
						.substring(0, 0)
						.concat(names[1]
								.toUpperCase()
								.substring(0, 1))
						.concat(Integer.toString(numAlAzar()));
		}else {
			idVuelo = companyName.toUpperCase()
					.substring(0, 3)
					.concat(Integer.toString(numAlAzar()));
		}
	}
	
}
