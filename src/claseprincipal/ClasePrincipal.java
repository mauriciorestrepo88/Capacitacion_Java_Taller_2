package claseprincipal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import beneficiarios.Beneficiarios;
import tipobeneficios.BeneficiosCovid19;

//Clase principal
public class ClasePrincipal {

	// Método principal donde se ejecuta el programa
	public static void main(String[] args) {

		ArrayList<BeneficiosCovid19> bnsalida = Llenarinfobene1();
		ArrayList<BeneficiosCovid19> bnsalida2 = Llenarinfobene2();
		Beneficiarios cliente1 = infoBeneficiario1(bnsalida);
		Beneficiarios cliente2 = infoBeneficiario2(bnsalida2);
		System.out.println("************* REPORTE ************");
		mostrarInfoBeneficio1(bnsalida);
		mostrarInfoBeneficio2(bnsalida2);
		mostrarInfoBeneficiario1(cliente1);
		mostrarInfoBeneficiario2(cliente2);
		System.out.println("***** Mejor Beneficio *****");
		bnsalida.get(0).getMejorbeneficios(bnsalida2.get(0));

	}

	// Método para ingresar la información del beneficio 1
	public static ArrayList<BeneficiosCovid19> Llenarinfobene1() {
		String idbeneficio = " ";
		String nomnbrebeneficio = " ";
		float valorbeneficio = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<BeneficiosCovid19> beneficio1 = new ArrayList<BeneficiosCovid19>();
		try {
			System.out.println("********* Subsidio número 1 *********");
			System.out.println("Ingrese la descripción del beneficio:");
			nomnbrebeneficio = sc.nextLine();
			System.out.println("Ingrese el valor del beneficio:");
			valorbeneficio = sc.nextFloat();
			BeneficiosCovid19 bn1 = new BeneficiosCovid19(nomnbrebeneficio, valorbeneficio);
			bn1.setIdbeneficio(getIdBeneficio());
			beneficio1.add(bn1);

		} catch (Exception e) {
			System.out.println("Por favor ingrese un dato tipo float");
		}
		return beneficio1;
	}

	// Método para mostrar por consola la información del beneficio 1
	public static void mostrarInfoBeneficio1(ArrayList<BeneficiosCovid19> beneficio1) {
		BeneficiosCovid19 bn1 = beneficio1.get(0);
		System.out.println("********* Subsidio número 1 *********");
		System.out.println("ID Beneficio:" + " " + bn1.getIdbeneficio());
		System.out.println("Nombre del Beneficio: " + " " + bn1.getNomnbrebeneficio());
		System.out.println("Valor del beneficio:" + " " + bn1.getValorbeneficio());

	}

	// Método para ingresar la información del beneficio 2
	public static ArrayList<BeneficiosCovid19> Llenarinfobene2() {
		String idbeneficio = " ";
		String nomnbrebeneficio = " ";
		float valorbeneficio = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<BeneficiosCovid19> beneficio2 = new ArrayList<BeneficiosCovid19>();
		try {
			System.out.println("******** Subsidio número 2 ********");
			System.out.println("Ingrese la descripción del beneficio:");
			nomnbrebeneficio = sc.nextLine();
			System.out.println("Ingrese el valor del beneficio:");
			valorbeneficio = sc.nextFloat();
			BeneficiosCovid19 bn2 = new BeneficiosCovid19(nomnbrebeneficio, valorbeneficio);
			bn2.setIdbeneficio(getIdBeneficio());
			beneficio2.add(bn2);
		} catch (Exception e) {
			System.out.println("Por favor ingrese un dato tipo float");
		}

		return beneficio2;
	}

	// Método para mostrar por consola la información del beneficio 2
	public static void mostrarInfoBeneficio2(ArrayList<BeneficiosCovid19> beneficio2) {
		BeneficiosCovid19 bn2 = beneficio2.get(0);
		System.out.println("********* Subsidio número 2 *********");
		System.out.println("ID Beneficio:" + " " + bn2.getIdbeneficio());
		System.out.println("Nombre del Beneficio: " + " " + bn2.getNomnbrebeneficio());
		System.out.println("Valor del beneficio:" + " " + bn2.getValorbeneficio());

	}

	// Método para ingresar la información del beneficiario 1
	public static Beneficiarios infoBeneficiario1(ArrayList<BeneficiosCovid19> bnsalida) {
		Scanner sc = new Scanner(System.in);
		String nombreben = " ";
		String cedula = " ";
		Beneficiarios br1 = new Beneficiarios(nombreben, cedula, bnsalida);
		System.out.println("***** Datos Beneficiario 1 *****");
		System.out.println("Ingrese el nombre del beneficiario 1:");
		nombreben = sc.nextLine();
		System.out.println("Ingrese la cedula del beneficiario 1:");
		cedula = sc.nextLine();
		br1.setNombreben(nombreben);
		br1.setCedula(cedula);
		return br1;
	}

	// Método para mostrar por consola la información del beneficiario 1 y su
	// beneficio
	public static void mostrarInfoBeneficiario1(Beneficiarios br1) {
		System.out.println("***** Información Beneficiario 1 *****");
		System.out.println("El nombre del beneficiario 1 es:" + br1.getNombreben());
		System.out.println("la cedula del beneficiario 1 es:" + br1.getCedula());
		System.out.println("El beneficiario 1 tiene la siguiente información:" + "\n" + "Nombre:" + br1.getNombreben()
				+ "\n" + "Cédula:" + br1.getCedula() + "\n" + br1.getBeneficios());

	}

	// Método para ingresar la información del beneficiario 2
	public static Beneficiarios infoBeneficiario2(ArrayList<BeneficiosCovid19> bnsalida2) {
		Scanner sc = new Scanner(System.in);
		String nombreben = " ";
		String cedula = " ";
		Beneficiarios br2 = new Beneficiarios(nombreben, cedula, bnsalida2);
		System.out.println("***** Datos Beneficiario 2 *****");
		System.out.println("Ingrese el nombre del beneficiario 2:");
		nombreben = sc.nextLine();
		System.out.println("Ingrese la cedula del beneficiario 2:");
		cedula = sc.nextLine();
		br2.setNombreben(nombreben);
		br2.setCedula(cedula);
		return br2;
	}

	// Método para mostrar por consola la información del beneficiario 2 y su
	// beneficio
	public static void mostrarInfoBeneficiario2(Beneficiarios br2) {
		System.out.println("***** Información Beneficiario 2 *****");
		System.out.println("El nombre del beneficiario 2 es:" + br2.getNombreben());
		System.out.println("la cedula del beneficiario 2 es:" + br2.getCedula());
		System.out.println("El beneficiario 2 tiene la siguiente información:" + "\n" + "Nombre:" + br2.getNombreben()
				+ "\n" + "Cédula:" + br2.getCedula() + "\n" + br2.getBeneficios());

	}

	// Método para calcular aleatoriamente el ID del beneficio 1 y 2
	private static String getIdBeneficio() {
		Random r = new Random();
		String id = String.valueOf(r.nextInt(1000) + 1);
		return id;
	}

}
