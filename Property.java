
// Saila Kivela

public class Property {
	
	private String tyyppi;
	private String sijainti;
	
	public Property(String tyyppi, String sijainti) {
		this.tyyppi = tyyppi;
		this.sijainti = sijainti;
	}
	
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	public String getTyyppi() {
		return this.tyyppi;
	}
	
	public void setSijainti(String sijainti) {
		this.sijainti = sijainti;
	}
	
	public String getSijainti() {
		return this.sijainti;
	}
	
	public String toString() {
		return "\nkiinteiston tyyppi: " + this.tyyppi + "\nsijainti: " + this.sijainti;
	}
}
