package logica;

import java.util.ArrayList;
import inicializaciones.InicializacionDeDatos;

public class TiendaDeComputadoras {
	private static TiendaDeComputadoras instancia;
	private ArrayList<Trabajador> trabajadores;
	private ArrayList<ComponenteOrdenador> componentes;

	private TiendaDeComputadoras() {
		instancia = new TiendaDeComputadoras();
	}

	public static TiendaDeComputadoras getInstancia() {
		if(instancia == null) {
			instancia = new TiendaDeComputadoras();
		}
		return instancia;
	}


	public TiendaDeComputadoras(ArrayList<Trabajador> trabajadores, ArrayList<ComponenteOrdenador> componentes) {
		trabajadores = new ArrayList<Trabajador>();
		trabajadores = InicializacionDeDatos.crearTrabajadores();
		componentes = new ArrayList<ComponenteOrdenador>();
		componentes = InicializacionDeDatos.crearComponentes();
	}
}