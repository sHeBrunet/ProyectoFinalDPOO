package logica;

import java.util.ArrayList;

import inicializaciones.InicializacionDeDatos;

public class TarjetaMadre extends ComponenteOrdenador {
private String tipoDeConector; // Debe de coincidir con el de los microprocesadores // falta poner una relacion en el DCUML entre tarjetaMadre y Microprocesadores
private ArrayList<DiscoDuro> discos;
private ArrayList<MemoriaRam> memoriasR;

	public TarjetaMadre(int cantDisponible, String numSerie, String marca, String modelo, float precio, String tipoDeConector) {
		super(cantDisponible, numSerie, marca, modelo, precio);
		setTipoDeConector(tipoDeConector);
		
	}
	public String getTipoDeConector() {
		return tipoDeConector;
	}

	public void setTipoDeConector(String tipoDeConector) {
		boolean correcto = false;
		ArrayList<String> conectores = new ArrayList<String>();
		conectores = InicializacionDeDatos.conectores();
		for(String r: conectores) {
			if(tipoDeConector.equalsIgnoreCase(r)) {
				correcto = true;
				this.tipoDeConector = tipoDeConector;
			}
		}
		if(!correcto) {
			throw new IllegalArgumentException("El conector debe de ser  de tipo(LGA 1151, LGA1200, LGA 1700, AM4, AM3+, TR4)");
		}
		
	}

}
