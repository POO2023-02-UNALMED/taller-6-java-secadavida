package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	protected static int nVehiculos = 0;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;

		nVehiculos++;
	}

	public static int getnAutomoviles() {
		return nVehiculos;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
