
public class ObjetosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PERSONA
		System.out.println("PERSONA");
		
		// Instanciar con constructores:
		Persona prs = new Persona();
		Persona prs2 = new Persona("Sergio", 29, 'm');
		Persona prs3 = new Persona("Sergio", 29, "39930321K", 'm', 171, 58.8);
		
		// Print del que tiene atributos completos
		System.out.println("Atributos PERSONA (Completos): " + prs3.toString());
		
		// PASSWORD
		// Instanciar con ambos constructores:
		Password ps = new Password();
		Password ps2 = new Password(16);
		
		System.out.println();
		System.out.println("PASSWORD");

		System.out.println("Password generado (8 chars): " + ps.generarPassword());
		System.out.println("Password generado (16 chars): " + ps2.generarPassword());
		
		// ELECTRODOMESTICO
		
		System.out.println();
		System.out.println("ELECTRODOMÉSTICO");
		
		
		Electrodomestico es = new Electrodomestico();
		Electrodomestico es2 = new Electrodomestico(400, 180);
		
		// Instancio el objeto con los dos últimos valores inválidos para comprobar que se corrijan
		Electrodomestico es3 = new Electrodomestico(100, 100, "verde", 'J');
		
		// Uso dos getters para comprobar los valores corregidos de colores y consumo:
		System.out.println("Consumo: " + es3.getConsumo());
		System.out.println("Color: " + es3.getColor());
		
		// Print del constructor con parámetros completos
		System.out.println("Atributos ELECTRODOMÉSTICO (Completos): " + es3.toString());
		
		// SERIE
		
		System.out.println();
		System.out.println("SERIE");
		
		
		Serie sr = new Serie();
		Serie sr2 = new Serie("Expediente X", "Vince Gilligan");
		Serie sr3 = new Serie("Expediente X", 4, "Misterio", "Vince Gilligan");
		
		// Print del objeto instanciado con constructor con parámetros completos:
		System.out.println("Atributos SERIE (Completos): " + sr3.toString());

	}

}
