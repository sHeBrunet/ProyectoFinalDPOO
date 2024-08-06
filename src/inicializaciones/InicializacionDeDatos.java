package inicializaciones;
import java.util.ArrayList;

import logica.ComponenteOrdenador;
import logica.Trabajador;

public class InicializacionDeDatos {
	public static ArrayList<Trabajador> crearTrabajadores() {
		ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();

		// Datos para los trabajadores
		listaTrabajadores.add(new Trabajador(1, "Juan", "P�rez", "92345678", "Universitario", "Gerente"));
		listaTrabajadores.add(new Trabajador(2, "Mar�a", "G�mez", "93456789", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(3, "Pedro", "Rodr�guez", "94567890", "T�cnico Medio", "Cajero"));
		listaTrabajadores.add(new Trabajador(4, "Ana", "L�pez", "95678901", "Primaria", "T�cnico"));
		listaTrabajadores.add(new Trabajador(5, "Luis", "Mart�nez", "96789012", "Universitario", "T�cnico"));
		listaTrabajadores.add(new Trabajador(6, "Laura", "S�nchez", "87890123", "Bachillerato", "T�cnico"));
		listaTrabajadores.add(new Trabajador(7, "Carlos", "Garc�a", "78901234", "Secundaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(8, "Luc�a", "Hern�ndez", "89012345", "Primaria", "Cajero"));
		listaTrabajadores.add(new Trabajador(9, "Jorge", "D�az", "90123456", "Universitario", "T�cnico"));
		listaTrabajadores.add(new Trabajador(10, "Sof�a", "Morales", "01234567", "Bachillerato", "Cajero"));

		listaTrabajadores.add(new Trabajador(11, "Andr�s", "Castillo", "72345679", "Secundaria", "Cajero"));
		listaTrabajadores.add(new Trabajador(12, "Marta", "Vargas", "93456780", "Tecnico Medio", "Asistente"));
		listaTrabajadores.add(new Trabajador(13, "Fernando", "Ram�rez", "84567891", "Universitario", "Asistente"));
		listaTrabajadores.add(new Trabajador(14, "Claudia", "Torres", "75678902", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(15, "Diego", "Rojas", "96789013", "T�cnico Medio", "T�cnico"));

		listaTrabajadores.add(new Trabajador(16, "Elena", "Jim�nez", "77890124", "Primaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(17, "Pablo", "Mendoza", "88901235", "Universitario", "Asistente"));
		listaTrabajadores.add(new Trabajador(18, "Teresa", "Salazar", "99012346", "Bachillerato", "Cajero"));
		listaTrabajadores.add(new Trabajador(19, "Ricardo", "Cruz", "90123457", "Secundaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(20, "Julia", "Ortega", "01234568", "Primaria", "T�cnico"));

		listaTrabajadores.add(new Trabajador(21, "David", "Aguilar", "82345680", "Primaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(22, "Carmen", "G�mez", "73456781", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(23, "Miguel", "P�rez", "64567892", "Universitario", "Economico"));
		listaTrabajadores.add(new Trabajador(24, "Patricia", "Rodr�guez", "85678903", "T�cnico Medio", "Cajero"));
		listaTrabajadores.add(new Trabajador(25, "Alejandro", "L�pez", "96789014", "Universitario", "T�cnico"));

		listaTrabajadores.add(new Trabajador(26, "Ver�nica", "Mart�nez", "97890125", "Bachillerato", "Gerente"));
		listaTrabajadores.add(new Trabajador(27, "Santiago", "S�nchez", "78901236", "Secundaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(28, "Gabriela", "Garc�a", "89012347", "Primaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(29, "Ra�l", "Hern�ndez", "90123458", "Universitario", "Cajero"));
		listaTrabajadores.add(new Trabajador(30, "Isabel", "D�az", "01234569", "Bachillerato", "Dise�ador"));

		return listaTrabajadores;
	}
	public static ArrayList<ComponenteOrdenador> crearComponentes(){
		//Datos para los productos

		return null;

	}


	public static ArrayList<String> resolucionVideo(){
		ArrayList<String> resoluciones = new ArrayList<String>();
		resoluciones.add("144");
		resoluciones.add("240");
		resoluciones.add("360");
		resoluciones.add("480");
		resoluciones.add("720");
		resoluciones.add("1080");
		return resoluciones;
	}
	public static ArrayList<String> nivelesEscolar(){
		ArrayList<String> nivel = new ArrayList<String>();
		nivel.add("Primaria");
		nivel.add("Secundaria");
		nivel.add("Bachillerato");
		nivel.add("Tecnico Medio");
		nivel.add("Universitario");
		return nivel;
	}
	public static ArrayList<String> cargos(){
		ArrayList<String> cargo = new ArrayList<String>();
		cargo.add("Auxiliar de Limpieza");
		cargo.add("Cajero");
		cargo.add("Asistente");
		cargo.add("T�cnico");
		cargo.add("Dise�ador");
		cargo.add("Econ�mico");
		cargo.add("Gerente");
		return cargo;
	}
	public static ArrayList<String> conexiones(){
		ArrayList<String> conexion = new ArrayList<String>();
		conexion.add("LGA 1151"); //Intel
		conexion.add("LGA 1200");
		conexion.add("LGA 1700");
		conexion.add("AM4");      //AMD
		conexion.add("AM3+");
		conexion.add("TR4");

		return conexion;
	}

	public static ArrayList<String> conectores(){
		ArrayList<String> conector = new ArrayList<String>();
		conector.add("LGA 1151");
		conector.add("LGA 1200");
		conector.add("LGA 1700");
		conector.add("AM4");
		conector.add("AM3+");
		conector.add("TR4");

		return conector;
	}

public static ArrayList<String> refrigeracion(){
	ArrayList<String> refrigeraciones = new ArrayList<String>();
	refrigeraciones.add("Aire");
	refrigeraciones.add("L�quido");
	refrigeraciones.add("Pasivo");
	refrigeraciones.add("Mixto");
	return refrigeraciones;
}


}
