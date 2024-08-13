package inicializaciones;
import java.sql.Date;
import java.util.ArrayList;

import logica.ComponenteOrdenador;
import logica.Gerente;
import logica.TiendaDeComputadoras;
import logica.Trabajador;

public class InicializacionDeDatos {
	public static void crearTrabajadores(TiendaDeComputadoras tienda) {
		
		// Datos para los trabajadores

		tienda.agregarTrabajador(new Trabajador(2, "María", "Gómez", "93052789095", 4000,"Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(3, "Pedro", "Rodríguez", "94060890136",1000, "Técnico Medio", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(4, "Ana", "López", "95071901456", 900, "Primaria", "Técnico"));
		tienda.agregarTrabajador(new Trabajador(5, "Luis", "Martínez", "96081012753",4500, "Universitario", "Técnico"));
		tienda.agregarTrabajador(new Trabajador(6, "Laura", "Sánchez", "87090123789",2000, "Preuniversitario", "Técnico"));
		tienda.agregarTrabajador(new Trabajador(7, "Carlos", "García", "78011234560", 1230, "Secundaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(8, "Lucía", "Hernández", "89012345789", 1234, "Primaria", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(9, "Jorge", "Díaz", "90120256542", 3453, "Universitario", "Técnico"));
		tienda.agregarTrabajador(new Trabajador(10, "Sofía", "Morales", "01040567712", 3456, "Preuniversitario", "Cajero"));

		tienda.agregarTrabajador(new Trabajador(11, "Andrés", "Castillo", "72041679456", 1234, "Secundaria", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(12, "Marta", "Vargas", "93051780542", 2000, "Técnico Medio", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(13, "Fernando", "Ramírez", "84061891789", 3000, "Universitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(14, "Claudia", "Torres", "75071902542", 4000, "Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(15, "Diego", "Rojas", "96081013324", 4000, "Técnico Medio", "Técnico"));

		tienda.agregarTrabajador(new Trabajador(16, "Elena", "Jiménez", "77090124785", 3400, "Primaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(17, "Pablo", "Mendoza", "88011235785", 4000, "Universitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(18, "Teresa", "Salazar", "99012346654", 3000, "Preuniversitario", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(19, "Ricardo", "Cruz", "90122157863", 2300, "Secundaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(20, "Julia", "Ortega", "01031568324", 1000, "Primaria", "Técnico"));

		tienda.agregarTrabajador(new Trabajador(21, "David", "Aguilar", "82111680452", 1000, "Primaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(22, "Carmen", "Gómez", "73021781421", 3000, "Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(23, "Miguel", "Pérez", "64061892245", 4000, "Universitario", "Económico"));
		tienda.agregarTrabajador(new Trabajador(24, "Patricia", "Rodríguez", "85071903354", 2300, "Técnico Medio", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(25, "Alejandro", "López", "96081014657", 3000, "Universitario", "Técnico"));

		tienda.agregarTrabajador(new Trabajador(27, "Santiago", "Sánchez", "78011236895", 2000, "Secundaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(28, "Gabriela", "García", "89012347741", 2000, "Primaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(29, "Raúl", "Hernández", "90121458101", 1000, "Universitario", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(30, "Isabel", "Díaz", "01011569014", 200, "Preuniversitario", "Diseñador"));

	}
		//Datos Gerentes
		public static void crearGerentes(TiendaDeComputadoras tienda) {
		    try {
		        if (tienda == null) {
		            throw new IllegalArgumentException("La instancia de TiendaDeComputadoras no puede ser null");
		        }
		        @SuppressWarnings("deprecation")
		        Date fecha1 = new Date(2023, 7, 10);
		        @SuppressWarnings("deprecation")
		        Date fecha2 = new Date(2022, 6, 10);
		        Trabajador t = new Gerente(1, "Juan", "Pérez", "92040678014", 5000, "Universitario", "Gerente", fecha1);
		        Trabajador t1 = new Gerente(26, "Verónica", "Martínez", "97090125954", 1000, "Universitario", "Gerente", fecha2);
		        tienda.agregarTrabajador((Trabajador)t);
		        tienda.agregarTrabajador((Trabajador)t1);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
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
		nivel.add("Preuniversitario");
		nivel.add("Técnico Medio");
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
