
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 4.
// Tietosailio kiinteistojen vakuutustietoja varten.


import java.io.*;
import java.util.Scanner;

public class Vkoteht4Main {

	public static void main(String[] args) {
		
		Property kiinteisto1 = new Property("kerrostalo", "Oulu");
		Property kiinteisto2 = new Property("huvila", "Ii");
		Property kiinteisto3 = new Property("omakotitalo", "Kempele");
		Property kiinteisto4 = new Property("rivitalo", "Oulu");
		Property kiinteisto5 = new Property("mokki", "Tyrnava");
				
		InsuranceInfo info1 = new InsuranceInfo(kiinteisto1, 100000.00);
		InsuranceInfo info2 = new InsuranceInfo(kiinteisto2, 350000.00);
		InsuranceInfo info3 = new InsuranceInfo(kiinteisto3, 279000.00);
		InsuranceInfo info4 = new InsuranceInfo(kiinteisto4, 165000.00);
		InsuranceInfo info5 = new InsuranceInfo(kiinteisto5, 50000.00);
		
		InsInfoContainer sailio = new InsInfoContainer(null);
		sailio.lisaaSailioon(info1);
		sailio.lisaaSailioon(info2);
		sailio.lisaaSailioon(info3);
		sailio.lisaaSailioon(info4);
		sailio.lisaaSailioon(info5);
		
		sailio.tulostaSailio();
		
		Scanner lukija = new Scanner(System.in);
		boolean ok = false;
		do {
			try {
				System.out.println("Anna vakuutusarvo, jota pienemmat tulostetaan: ");
				double raja = Double.parseDouble(lukija.nextLine());
				sailio.tulostaPienemmat(raja);
			
				System.out.println("Anna vakuutusarvo, jota suuremmat tulostetaan: ");
				raja = Double.parseDouble(lukija.nextLine());
				sailio.tulostaSuuremmat(raja);
				ok = true;
				
			}catch (NumberFormatException nfe) {
				System.out.println("Virhe syotteessa.");
				System.out.println(nfe.toString());
			}
		} while (ok != true);
	}
}
