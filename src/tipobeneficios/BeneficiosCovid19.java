package tipobeneficios;

import java.util.Random;

//Clase Beneficios

public class BeneficiosCovid19 {
	private String idbeneficio;
	private String nomnbrebeneficio;
	private float valorbeneficio;

	// Constructor clase beneficios
	public BeneficiosCovid19(String nomnbrebeneficio, float valorbeneficio) {

		this.nomnbrebeneficio = nomnbrebeneficio;
		this.valorbeneficio = valorbeneficio;
	}

	// Métodos getters and Setters
	public String getIdbeneficio() {
		String id = new String(idbeneficio);
		return id;
	}

	public void setIdbeneficio(String idbeneficio) {
		String id = new String(idbeneficio);
		this.idbeneficio = id;
	}

	public String getNomnbrebeneficio() {
		String nombreben = new String(nomnbrebeneficio);
		return nombreben;
	}

	public void setNomnbrebeneficio(String nomnbrebeneficio) {
		String nombreben = new String(nomnbrebeneficio);
		this.nomnbrebeneficio = nombreben;
	}

	public float getValorbeneficio() {
		Float valorben = new Float(valorbeneficio);
		return valorben;
	}

	public void setValorbeneficio(float valorbeneficio) {
		Float valorben = new Float(valorbeneficio);
		this.valorbeneficio = valorben;
	}

	// Método para calcular el mejor beneficio
	public Float getMejorbeneficios(BeneficiosCovid19 obj2) {
		float mejorbeneficio = 0;
		if (getValorbeneficio() > obj2.getValorbeneficio()) {
			mejorbeneficio = getValorbeneficio();
			System.out.println("El mejor beneficio es el 1 y su valor es:" + getValorbeneficio());

		} else {
			mejorbeneficio = obj2.getValorbeneficio();
			System.out.println("El mejor beneficio es el 2 y su valor es:" + obj2.getValorbeneficio());

		}
		return Float.valueOf(mejorbeneficio);
	}

	@Override
	public String toString() {
		return "ID Beneficio:" + idbeneficio + "\n" + "Nombre del Beneficio:" + nomnbrebeneficio + "\n"
				+ "Valor del Beneficio:" + valorbeneficio;
	}

}
