package uniandes.dpoo.taller0.modificacion;

import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			Map<String, Integer> paises = calc.paisConMasMedallistas();

			if (paises.size() == 1){
				System.out.print("\nEl país con más medallistas es:");
			} else if (paises.size() >= 1) {
				System.out.print("\nLos países con más medallistas son:");
			}
			for (String nombre : paises.keySet()){
				System.out.print(" " + nombre);
			}
			
		} catch(IOException ie) {
            ie.printStackTrace();
        }
	}

}
