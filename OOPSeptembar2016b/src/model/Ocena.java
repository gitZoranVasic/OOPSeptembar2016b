package model;

public class Ocena {
	private int ocena;
	private int idOcena;
	private String komentar;
	
	public Ocena(int ocena, int idOcena, String komentar) {
		this.ocena = ocena;
		this.idOcena = idOcena;
		this.komentar = komentar;
	}

	public int getOcena() {
		return ocena;
	}

	public int getIdOcena() {
		return idOcena;
	}

	public String getKomentar() {
		return komentar;
	}
		
	
}
