package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Film {
	private String naslov;
	private Integer godinaProizvodnje;
	private String reziser;
	private String glumci;
	private String zanr;
	private int idFilm;
	private ObservableList<Ocena> ocene;
	private double prosecnaOcena;
	
	public Film(String naslov, Integer godinaProizvodnje, String reziser, String glumci, String zanr, int idFilm) {
		
		this.naslov = naslov;
		this.godinaProizvodnje = godinaProizvodnje;
		this.reziser = reziser;
		this.glumci = glumci;
		this.zanr = zanr;
		this.idFilm = idFilm;
		this.prosecnaOcena = 0;
		
		ocene = FXCollections.observableArrayList();
	}

	public void izracunajProsecnuOcenu() {
		this.prosecnaOcena = 0;
		int brojilac = 0;
		for (Ocena ocena : ocene) {
			brojilac+=ocena.getOcena();
		}
		prosecnaOcena = (double)brojilac/(double)ocene.size();
	}
	
	public double getProsecnaOcena() {
		return prosecnaOcena;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public Integer getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(Integer godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public String getReziser() {
		return reziser;
	}

	public void setReziser(String reziser) {
		this.reziser = reziser;
	}

	public String getGlumci() {
		return glumci;
	}

	public void setGlumci(String glumci) {
		this.glumci = glumci;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public ObservableList<Ocena> getOcene() {
		return ocene;
	}

	public void setOcene(ObservableList<Ocena> ocene) {
		this.ocene = ocene;
	}
	
	
	
	
	
}
