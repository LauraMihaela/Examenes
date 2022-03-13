package trimestre2.prueba2;

public class TratarPrecipitaciones {
	
	static final int MESES=12;

	public static int[] obtenerPrecipitacionAnual(int[][] precipitaciones) {
		int precipitacionAnual[] = new int[precipitaciones.length];

		int suma = 0;
		for (int i = 0; i < precipitaciones.length; i++) { // recorre filas-localidades
			for (int j = 0; j < precipitaciones[0].length; j++) {// recorrido en cada fila
				suma += precipitaciones[i][j];
			} // termino de recorrer la fila
			precipitacionAnual[i] = suma;
			suma = 0;
		}
		return precipitacionAnual;
	}
	
	public static int[] obtenerPromedioMensual (int[][] precipitaciones) {
		return null;
	}
	
	public static int[] obtenerMesesExtremos (int[][] precipitaciones, int localidad) {
		return null;
	}
	
	public static int[][] obtenerMesesExtremos (int[][] precipitaciones) {
		return null;
	}

}
