package es.cipfpbatoi.damb.ad.procesador.rutas;
import java.io.File;

public class ProcesadorRutas {

	public static StringBuilder procesarRuta(String ruta) {
		File archivoInicial = new File(ruta);

		StringBuilder resultadoProceso = new StringBuilder();
		revisarCarpeta(archivoInicial.listFiles(), resultadoProceso);

		resultadoProceso.append("Vamos a buscar en la ruta: " + ruta + "\n");
		resultadoProceso.append("Procesando directorio...\n");

		return resultadoProceso;
	}


	private static void revisarCarpeta (File[] carpeta, StringBuilder resultado){
		for (File archivo : carpeta) {
			if (archivo.isFile()) {
				resultado.append(archivo.getName() + "\n");
			} else {
				revisarCarpeta(archivo.listFiles(),resultado);

			}
		}
	}

}

