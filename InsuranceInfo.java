
// Saila Kivela

public class InsuranceInfo {

	private Property kiinteisto;
	private double arvo;
	
	public InsuranceInfo(Property kiinteisto, double arvo) {
		this.kiinteisto = kiinteisto;
		this.arvo = arvo;
	}
	
	public void setProperty(Property kiinteisto) {
		this.kiinteisto = kiinteisto;
	}
	
	public Property getProperty() {
		return this.kiinteisto;
	}
	
	public void setArvo(double arvo) {
		this.arvo = arvo;
	}
	
	public double getArvo() {
		return this.arvo;
	}
	
	public String toString() {
		return kiinteisto + "\nvakuutusarvo: " + this.arvo + " e\n";
	}
}
