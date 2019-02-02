
import java.util.Vector;

// Saila Kivela

public class InsInfoContainer {

	private Vector<InsuranceInfo> sailio = new Vector<InsuranceInfo>();
	
	public InsInfoContainer(InsuranceInfo info) {
		this.sailio = new Vector<>();
	}
	
	public void lisaaSailioon(InsuranceInfo info) {
		sailio.add(info);
	}
	
	public void tulostaSailio() {
		System.out.println(sailio.toString());
	}
	
	public void tulostaSuuremmat(double raja) {
		for(int i = 0; i < sailio.size(); i++) {
			if(sailio.get(i).getArvo() > raja) {
				System.out.println(sailio.get(i));
			}
		}
	}
	
	public void tulostaPienemmat(double raja) {
		for(int i = 0; i < sailio.size(); i++) {
			if(sailio.get(i).getArvo() < raja) {
				System.out.println(sailio.get(i));
			}
		}
	}
}
