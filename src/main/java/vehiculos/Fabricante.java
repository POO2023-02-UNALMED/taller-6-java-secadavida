package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMayorVentas() {
		ArrayList<Fabricante> fabricantes = Vehiculo.arrayFabricantes;

		int n = fabricantes.size();
		int maxCount = 0;
		Fabricante fabricaMayorVentas = null;

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++)
				if (fabricantes.get(j) == fabricantes.get(i)) count++;

			if (count > maxCount) {
				maxCount = count;
				fabricaMayorVentas = fabricantes.get(i);
			}
		}
		return fabricaMayorVentas;
	}
}
