package yirmikasim;

import java.util.ArrayList;

public class Televizyon {

	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanalListesi;

	public void kanallarıOlustur() {

		HaberKanali kanal1 = new HaberKanali("KanalD", 1, "Tlc");
		MuzikKanali kanal2 = new MuzikKanali("CnnTurk", 2, "FoxTv");
		HaberKanali kanal3 = new HaberKanali("Ntv", 3, "Cnbc");
		MuzikKanali kanal4 = new MuzikKanali("Trt1", 4, "Dmax");
		kanalListesi.add(kanal1);
		kanalListesi.add(kanal2);
		kanalListesi.add(kanal3);
		kanalListesi.add(kanal4);

	}

	public void kana1goster() {
		System.out.println(
				"Kanal adı: " + kanalListesi.get(0).getKanalAdi() + " Kanal no:" + kanalListesi.get(0).getKanalNo());
	}

	public void kana2goster() {

		System.out.println(
				"Kanal adı: " + kanalListesi.get(1).getKanalAdi() + " Kanal no:" + kanalListesi.get(1).getKanalNo());
	}

	public void kana3goster() {

		System.out.println(
				"Kanal adı: " + kanalListesi.get(2).getKanalAdi() + " Kanal no:" + kanalListesi.get(2).getKanalNo());
	}

	public void kana4goster() {

		System.out.println(
				"Kanal adı: " + kanalListesi.get(3).getKanalAdi() + " Kanal no:" + kanalListesi.get(3).getKanalNo());
	};

	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		kanalListesi = new ArrayList<Kanal>();
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanalListesi() {
		return kanalListesi;
	}

	public void setKanalListesi(ArrayList<Kanal> kanalListesi) {
		this.kanalListesi = kanalListesi;
	}

}