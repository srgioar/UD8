
public class Serie {
	
	String titulo;
	int temporadas;
	boolean entregado;
	String genero;
	String creador;
	
	
	public Serie() {
		this.titulo = "";
		this.temporadas = 0;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.genero = "";
		this.creador = creador;
		this.entregado = false;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

}
