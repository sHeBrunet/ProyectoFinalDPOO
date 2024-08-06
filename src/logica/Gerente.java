package logica;

import java.sql.Date;

public class Gerente extends Trabajador {
	private Date fechaOcupCargo;
	
	public Gerente(int numero, String nombre, String apellidos, String cI, String nivelEscolar, String cargo,Date fechaOcupCargo) {
		super(numero, nombre, apellidos, cI, nivelEscolar, cargo);
		setFechaOcupCargo(fechaOcupCargo);
	}

	public Date getFechaOcupCargo() {
		return fechaOcupCargo;
	}

	public void setFechaOcupCargo(Date fechaOcupCargo) {
		this.fechaOcupCargo = fechaOcupCargo;
	}

}
