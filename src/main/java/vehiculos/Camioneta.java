package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	protected static int nCamionetas = 0;

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;

		nCamionetas++;
	}

	public static int getnCamionetas() {
		return nCamionetas;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
