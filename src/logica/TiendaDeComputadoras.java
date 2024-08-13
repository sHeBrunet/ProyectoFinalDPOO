package logica;

import java.util.ArrayList;
import inicializaciones.InicializacionDeDatos;

public class TiendaDeComputadoras {
	private static TiendaDeComputadoras instancia;
	private ArrayList<Trabajador> trabajadores;
	private ArrayList<ComponenteOrdenador> componentes;

	private TiendaDeComputadoras() {
		trabajadores = new ArrayList<>();
		componentes = new ArrayList<>();
	}

	public static TiendaDeComputadoras getInstancia() {
		if(instancia == null) {
			instancia = new TiendaDeComputadoras();
		}
		return instancia;
	}

	public int getCantTrabajadores() {
		return trabajadores.size();
	}
	public int getCantComponenetes() {
		return componentes.size();
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Trabajador> getTrabajadores() {
		return (ArrayList<Trabajador>) trabajadores.clone();
	}

	private int buscarTrabajador(int numTrabajador){
		int pos = -1;
		int i = 0;
		boolean found = false;
		while (i < trabajadores.size() && !found){
			if (trabajadores.get(i).getNumero() == numTrabajador) {
				pos = i;
				found = true;
			} else
				i++;
		}
		return pos;		
	}

	public boolean agregarTrabajador(Trabajador trabajador){
		boolean agregado = true;
		if(trabajador == null || buscarTrabajador(trabajador.getNumero()) != -1){
			agregado = false;
		}
		else{			
			agregado = trabajadores.add(trabajador);
		}
		return agregado;
	}
	public int getUltimoNoTrabajador() {
		return trabajadores.size();
	}
	public Trabajador eliminarTrabajador(int posicion){
		Trabajador eliminado = null;
		if(posicion >= 0 && posicion < trabajadores.size()) {
			eliminado = trabajadores.remove(posicion);
		}
		return eliminado;			
	}


	public ArrayList<Gerente> getGerentes() {	
		ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
		for(Trabajador t : trabajadores) {
			if(t instanceof Gerente) {
				gerentes.add((Gerente) t);
			}
		}
		return gerentes;
	}
	public boolean buscarCI(String CI) {
		boolean encontrado = true;
		for(Trabajador t: trabajadores) {
			if(!t.getCI().equals(CI)) {
				encontrado = false;
			}
		}
		return encontrado;
	}

}