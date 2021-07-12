
public class Password {
	
	private int longitud;
	private String password;
	
	public Password() {
		this.longitud = 8;
		this.password = generarPassword();
		
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword();
		
	}
	
	public String generarPassword() {
		
		//Scope local longpass -> longitud actual del objeto
		int longPass = this.longitud;
		
		String strFinal = "";
		
		for (int i = 0; i < longPass; i++) {
			int randomNum = (int) (Math.random() * 72 + 48);
			Character a = (char) randomNum;
			
			strFinal += a;
		}
		
		return strFinal;
		
	}

}
