package logica;
import java.util.ArrayList;

import inicializaciones.InicializacionDeDatos;
public class Trabajador {
	private int numero;
	private String nombre;
	private String apellidos;
	private String CI;
	private static float salarioBasico;
	private String nivelEscolar;
	private String cargo;

	public Trabajador(int numero) {
		this(numero, "", "", "", "", "");
	}	
	public Trabajador(int numero,String nombre, String apellidos, String cI, String nivelEscolar,
			String cargo) {
		this.numero = numero;
		setNombre(nombre);
		setApellidos(apellidos);
		setCI(cI);
		setNivelEscolar(nivelEscolar);
		setCargo(cargo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre != null && nombre != "") {
			this.nombre = nombre;
		}
		else {
			throw new IllegalArgumentException("El nombre del trabajador no puede estar vacio");
		}	
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if(apellidos != null && apellidos != "") {
			this.apellidos = apellidos;
		}
		else {
			throw new IllegalArgumentException("Los apellidos del trabajador no pueden estar vacio");
		}
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		// Verificar que el carnet tenga exactamente 11 dígitos
		if (cI.length() != 11 || !cI.matches("\\d{11}")) {
			throw new IllegalArgumentException("El carnet debe tener exactamente 11 dígitos numéricos.");
		}

		// Extraer año, mes y día
		int anioNacimiento = Integer.parseInt(cI.substring(0, 2)) + 1950; // Asumimos que son años a partir de 1950
		int mesNacimiento = Integer.parseInt(cI.substring(2, 4));
		int diaNacimiento = Integer.parseInt(cI.substring(4, 6));

		// Validar año de nacimiento
		if (anioNacimiento < 1950) {
			throw new IllegalArgumentException("El año de nacimiento debe ser a partir de 1950.");
		}

		// Validar mes de nacimiento
		if (mesNacimiento < 1 || mesNacimiento > 12) {
			throw new IllegalArgumentException("El mes de nacimiento debe estar entre 01 y 12.");
		}

		// Validar día de nacimiento según el mes
		if (!validarDia(anioNacimiento, mesNacimiento, diaNacimiento)) {
			throw new IllegalArgumentException("El día de nacimiento no es válido para el mes y año dados.");
		}
	}

	private boolean validarDia(int anio, int mes, int dia) {
		// Días por mes
		int diasPorMes;
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			diasPorMes = 31;
			break;
		case 4: case 6: case 9: case 11:
			diasPorMes = 30;
			break;
		case 2:
			// Verificar si es año bisiesto
			if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
				diasPorMes = 29; // Año bisiesto
			}
			else {
				diasPorMes = 28; // No es bisiesto
			}
			break;
		default:
			return false; // Mes inválido
		}

		return dia >= 1 && dia <= diasPorMes; // Validar el rango del día
	}

	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return String.valueOf(numero) + "-" + nombre;
	}

	public float getSalarioBasico() {
		return salarioBasico;
	}
	public static void setSalarioBasico(float salarioBasicoN) {
		salarioBasico = salarioBasicoN;
	}
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	public void setNivelEscolar(String nivelEscolar) {
		boolean correcto = false;
		ArrayList<String> niveles = new ArrayList<String>();
		niveles = InicializacionDeDatos.nivelesEscolar();
		for(String r: niveles) {
			if(nivelEscolar.equalsIgnoreCase(r)) {
				correcto = true;
				this.nivelEscolar = nivelEscolar;
			}
		}
		if(!correcto) {
			throw new IllegalArgumentException("El nivel escolar debe de ser de tipo (Primaria, Secundaria, Técnico Medio, Bachillerato, Universitario)");
		}
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		boolean correcto = false;
		ArrayList<String> cargos = new ArrayList<String>();
		cargos = InicializacionDeDatos.cargos();
		for(String r: cargos) {
			if(cargo.equalsIgnoreCase(r)) {
				correcto = true;
				this.cargo = cargo;
			}
		}
		if(!correcto) {
			throw new IllegalArgumentException("El cargo debe de ser de tipo (Auxiliar de Limpieza, , Cajero, Asistente, Técnico, Diseñador, Economico, Gerente)");
		}

	}

}
