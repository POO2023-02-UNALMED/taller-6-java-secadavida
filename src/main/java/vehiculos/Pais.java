package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Pais paisMasVendedor() {
		ArrayList<Pais> paises = Vehiculo.arrayPaises;

		int n = paises.size();
		int maxCount = 0;
		Pais paisMasVendedor = null;

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++)
				if (paises.get(j) == paises.get(i)) count++;

			if (count > maxCount) {
				maxCount = count;
				paisMasVendedor = paises.get(i);
			}
		}
		return paisMasVendedor;
	}
}
