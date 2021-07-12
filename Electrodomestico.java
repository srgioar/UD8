
public class Electrodomestico {
	
	protected final double precioBase;
	protected final double peso;
	protected final String COLOR;
	protected final Character CONSUMO;

	public Electrodomestico() {
		this.precioBase = 100.00;
		this.peso = 5;
		this.COLOR = "blanco";
		this.CONSUMO = 'A';
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		
		this.COLOR = "blanco";
		this.CONSUMO = 'A';
	}
	
	public Electrodomestico(double precioBase, double peso, String color, Character consumo) {
		this.COLOR = setearColor(color);
		this.CONSUMO = setearConsumo(consumo);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public String setearColor(String color) {
		
		//Pasamos a minúscula
		String thisColor = color.toLowerCase();
		
//		switch (color) {
//		default:
//			color = "blanco";
//		}
		
		if (color != "blanco" && color != "negro" && color != "rojo" && color != "azul" && color != "gris") {
			thisColor = "blanco";
		}
		
		return thisColor;
		
	}
	
	public String getColor() {
		return this.COLOR;
	}
	
	public Character getConsumo() {
		return this.CONSUMO;
	}
	
	public Character setearConsumo(Character consumo) {
		
		//Pasamos a minúscula
		Character thisConsumo = Character.toLowerCase(consumo);
		
//		switch (color) {
//		default:
//			color = "blanco";
//		}
		
		if (thisConsumo != 'A' && thisConsumo != 'B' && thisConsumo != 'C' && thisConsumo != 'D' && thisConsumo != 'E' && thisConsumo != 'F') {
			thisConsumo = 'F';
		}
		
		return thisConsumo;
		
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", COLOR=" + COLOR + ", CONSUMO="
				+ CONSUMO + "]";
	}
	
	

}
