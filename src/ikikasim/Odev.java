package ikikasim;

public class Odev {

	public static void main(String[] args) {

		String sehirler = "01-Adana;02-Adıyaman;03-Afyon;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;11-Bilecik;12-Bingöl;13-Bitlis;14-Bolu";
		sehirler.trim();
		String[] sehirPlaka;
		String sehirlerSplit[] = sehirler.split(";");

		for (String sehir : sehirlerSplit) {
			System.out.println(sehir);
		}

		System.out.println("\nYENİ:\n");
	

		for (String sehir2 : sehirlerSplit) {
			sehirPlaka = sehir2.split("-");
			System.out.println(sehirPlaka[1] + " plaka kodu:\t" + sehirPlaka[0] + "");
		}

	}

}
