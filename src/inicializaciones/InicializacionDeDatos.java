package inicializaciones;
import java.util.ArrayList;

import logica.ComponenteOrdenador;
import logica.Trabajador;

public class InicializacionDeDatos {
	public static ArrayList<Trabajador> crearTrabajadores() {
		ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();

		// Datos para los trabajadores
		listaTrabajadores.add(new Trabajador(1, "Juan", "Pérez", "92345678", "Universitario", "Gerente"));
		listaTrabajadores.add(new Trabajador(2, "María", "Gómez", "93456789", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(3, "Pedro", "Rodríguez", "94567890", "Técnico Medio", "Cajero"));
		listaTrabajadores.add(new Trabajador(4, "Ana", "López", "95678901", "Primaria", "Técnico"));
		listaTrabajadores.add(new Trabajador(5, "Luis", "Martínez", "96789012", "Universitario", "Técnico"));
		listaTrabajadores.add(new Trabajador(6, "Laura", "Sánchez", "87890123", "Bachillerato", "Técnico"));
		listaTrabajadores.add(new Trabajador(7, "Carlos", "García", "78901234", "Secundaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(8, "Lucía", "Hernández", "89012345", "Primaria", "Cajero"));
		listaTrabajadores.add(new Trabajador(9, "Jorge", "Díaz", "90123456", "Universitario", "Técnico"));
		listaTrabajadores.add(new Trabajador(10, "Sofía", "Morales", "01234567", "Bachillerato", "Cajero"));

		listaTrabajadores.add(new Trabajador(11, "Andrés", "Castillo", "72345679", "Secundaria", "Cajero"));
		listaTrabajadores.add(new Trabajador(12, "Marta", "Vargas", "93456780", "Tecnico Medio", "Asistente"));
		listaTrabajadores.add(new Trabajador(13, "Fernando", "Ramírez", "84567891", "Universitario", "Asistente"));
		listaTrabajadores.add(new Trabajador(14, "Claudia", "Torres", "75678902", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(15, "Diego", "Rojas", "96789013", "Técnico Medio", "Técnico"));

		listaTrabajadores.add(new Trabajador(16, "Elena", "Jiménez", "77890124", "Primaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(17, "Pablo", "Mendoza", "88901235", "Universitario", "Asistente"));
		listaTrabajadores.add(new Trabajador(18, "Teresa", "Salazar", "99012346", "Bachillerato", "Cajero"));
		listaTrabajadores.add(new Trabajador(19, "Ricardo", "Cruz", "90123457", "Secundaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(20, "Julia", "Ortega", "01234568", "Primaria", "Técnico"));

		listaTrabajadores.add(new Trabajador(21, "David", "Aguilar", "82345680", "Primaria", "Auxiliar de Limpieza"));
		listaTrabajadores.add(new Trabajador(22, "Carmen", "Gómez", "73456781", "Bachillerato", "Asistente"));
		listaTrabajadores.add(new Trabajador(23, "Miguel", "Pérez", "64567892", "Universitario", "Economico"));
		listaTrabajadores.add(new Trabajador(24, "Patricia", "Rodríguez", "85678903", "Técnico Medio", "Cajero"));
		listaTrabajadores.add(new Trabajador(25, "Alejandro", "López", "96789014", "Universitario", "Técnico"));

		listaTrabajadores.add(new Trabajador(26, "Verónica", "Martínez", "97890125", "Bachillerato", "Gerente"));
		listaTrabajadores.add(new Trabajador(27, "Santiago", "Sánchez", "78901236", "Secundaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(28, "Gabriela", "García", "89012347", "Primaria", "Asistente"));
		listaTrabajadores.add(new Trabajador(29, "Raúl", "Hernández", "90123458", "Universitario", "Cajero"));
		listaTrabajadores.add(new Trabajador(30, "Isabel", "Díaz", "01234569", "Bachillerato", "Diseñador"));

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
		cargo.add("Técnico");
		cargo.add("Diseñador");
		cargo.add("Económico");
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
	refrigeraciones.add("Líquido");
	refrigeraciones.add("Pasivo");
	refrigeraciones.add("Mixto");
	return refrigeraciones;
}


}
