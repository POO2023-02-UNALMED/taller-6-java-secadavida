package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	protected static int nCamiones = 0;

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;

		nCamiones++;
	}

	public static int getnCamiones() {
		return nCamiones;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
