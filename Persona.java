
public class Persona {
	
	private String nombre;
	private int edad;
	private String DNI;
	private final Character SEXO;
	private double peso;
	private int altura;
	
	// Establece por defecto h como sexo y en caso de valor erróneo lo setea también a h
	public Character controlarSexo(Character sexo) {
		
		switch (sexo) {
			case 'h':
				break;
			case 'm':
				break;
			default:
				sexo = 'h';
				break;
			}
		
		return sexo;
	}
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.SEXO = 'h';
		this.altura = 0;
		this.peso = 0.0;
	}
	
	public Persona(String nombre, int edad, Character sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.SEXO = controlarSexo(sexo);
		this.altura = 0;
		this.peso = 0.0;
		
	}
	
	public Persona(String nombre, int edad, String DNI, Character sexo, int altura, double peso) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.SEXO = controlarSexo(sexo);
		this.altura = altura;
		this.peso = peso;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + SEXO + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
