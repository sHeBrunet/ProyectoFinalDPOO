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

		tienda.agregarTrabajador(new Trabajador(2, "Mar�a", "G�mez", "93052789095", 4000,"Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(3, "Pedro", "Rodr�guez", "94060890136",1000, "T�cnico Medio", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(4, "Ana", "L�pez", "95071901456", 900, "Primaria", "T�cnico"));
		tienda.agregarTrabajador(new Trabajador(5, "Luis", "Mart�nez", "96081012753",4500, "Universitario", "T�cnico"));
		tienda.agregarTrabajador(new Trabajador(6, "Laura", "S�nchez", "87090123789",2000, "Preuniversitario", "T�cnico"));
		tienda.agregarTrabajador(new Trabajador(7, "Carlos", "Garc�a", "78011234560", 1230, "Secundaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(8, "Luc�a", "Hern�ndez", "89012345789", 1234, "Primaria", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(9, "Jorge", "D�az", "90120256542", 3453, "Universitario", "T�cnico"));
		tienda.agregarTrabajador(new Trabajador(10, "Sof�a", "Morales", "01040567712", 3456, "Preuniversitario", "Cajero"));

		tienda.agregarTrabajador(new Trabajador(11, "Andr�s", "Castillo", "72041679456", 1234, "Secundaria", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(12, "Marta", "Vargas", "93051780542", 2000, "T�cnico Medio", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(13, "Fernando", "Ram�rez", "84061891789", 3000, "Universitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(14, "Claudia", "Torres", "75071902542", 4000, "Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(15, "Diego", "Rojas", "96081013324", 4000, "T�cnico Medio", "T�cnico"));

		tienda.agregarTrabajador(new Trabajador(16, "Elena", "Jim�nez", "77090124785", 3400, "Primaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(17, "Pablo", "Mendoza", "88011235785", 4000, "Universitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(18, "Teresa", "Salazar", "99012346654", 3000, "Preuniversitario", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(19, "Ricardo", "Cruz", "90122157863", 2300, "Secundaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(20, "Julia", "Ortega", "01031568324", 1000, "Primaria", "T�cnico"));

		tienda.agregarTrabajador(new Trabajador(21, "David", "Aguilar", "82111680452", 1000, "Primaria", "Auxiliar de Limpieza"));
		tienda.agregarTrabajador(new Trabajador(22, "Carmen", "G�mez", "73021781421", 3000, "Preuniversitario", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(23, "Miguel", "P�rez", "64061892245", 4000, "Universitario", "Econ�mico"));
		tienda.agregarTrabajador(new Trabajador(24, "Patricia", "Rodr�guez", "85071903354", 2300, "T�cnico Medio", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(25, "Alejandro", "L�pez", "96081014657", 3000, "Universitario", "T�cnico"));

		tienda.agregarTrabajador(new Trabajador(27, "Santiago", "S�nchez", "78011236895", 2000, "Secundaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(28, "Gabriela", "Garc�a", "89012347741", 2000, "Primaria", "Asistente"));
		tienda.agregarTrabajador(new Trabajador(29, "Ra�l", "Hern�ndez", "90121458101", 1000, "Universitario", "Cajero"));
		tienda.agregarTrabajador(new Trabajador(30, "Isabel", "D�az", "01011569014", 200, "Preuniversitario", "Dise�ador"));

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
		        Trabajador t = new Gerente(1, "Juan", "P�rez", "92040678014", 5000, "Universitario", "Gerente", fecha1);
		        Trabajador t1 = new Gerente(26, "Ver�nica", "Mart�nez", "97090125954", 1000, "Universitario", "Gerente", fecha2);
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
		nivel.add("T�cnico Medio");
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
