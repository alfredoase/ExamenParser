import java.util.ArrayList;

public class Asignatura {
	private String nombreAsignatura;
	private int horasAsignatura;
	private String profesor;
	private String despacho;

	//Constructor
	public Asignatura() {
		
	}
	
	//FALTA IMPLEMENTAR LOS GETTERS Y SETTERS...
	
	public Asignatura(String nombreAsignatura, int horasAsignatura, String profesor, String despacho) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.horasAsignatura = horasAsignatura;
		this.profesor = profesor;
		this.despacho = despacho;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public int getHorasAsignatura() {
		return horasAsignatura;
	}

	public void setHorasAsignatura(int horasAsignatura) {
		this.horasAsignatura = horasAsignatura;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	//Metodo print
	public void print() {
		System.out.println("-- Asignatura propiedades --");
		System.out.println("Nombre:" + nombreAsignatura);
		System.out.println("Horas: " + horasAsignatura);
		System.out.println("Profesor: " + profesor + " y despacho: " + despacho);
		System.out.println(" ");
	}

}
