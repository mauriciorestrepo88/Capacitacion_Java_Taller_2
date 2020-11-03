package beneficiarios;

import java.util.ArrayList;

import tipobeneficios.BeneficiosCovid19;

//Clase Beneficiarios
public class Beneficiarios {

	private String nombreben;
	private String cedula;
	private ArrayList<BeneficiosCovid19> beneficios;

	// Constructor clase beneficiarios
	public Beneficiarios(String nombreben, String cedula, ArrayList<BeneficiosCovid19> beneficios) {
		this.nombreben = nombreben;
		this.cedula = cedula;
		this.beneficios = beneficios;

	}

	// Métodos getters and Setters
	public String getNombreben() {
		return nombreben;
	}

	public void setNombreben(String nombreben) {
		this.nombreben = nombreben;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<BeneficiosCovid19> getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(ArrayList<BeneficiosCovid19> beneficios) {
		this.beneficios = beneficios;
	}

	@Override
	public String toString() {
		return "Nombre beneficiario:" + nombreben + "\n" + "Cédula Beneficiario:" + cedula + "\n" + " Beneficios:"
				+ beneficios;
	}

}
