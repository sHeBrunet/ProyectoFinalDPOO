package logica;

public class Bocina extends ComponenteOrdenador {
	private String conectividad;

	public Bocina(int cantDisponible, String numSerie, String marca, String modelo, float precio, String conectividad) {
		super(cantDisponible, numSerie, marca, modelo, precio);
		setConectividad(conectividad);
	}

	public String getConectividad() {
		return conectividad;
	}
	public void setConectividad(String conectividad) {
		if(conectividad.equalsIgnoreCase("cable") || conectividad.equalsIgnoreCase("inal�mbrica")) {
			this.conectividad = conectividad;
		}
		else {
			throw new IllegalArgumentException("El tipo de conectividad debe de ser inal�mbrica o por cable");
		}
	}
}
