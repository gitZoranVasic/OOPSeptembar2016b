package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Baza {
	
	private static Baza instance = null;
	
	ObservableList<Film> filmovi;
	
	public Baza() {
		filmovi = FXCollections.observableArrayList();
		ucitajBazu();
	}
	
	public void ucitajBazu() {
		ucitajBazuFilmova();
		ucitajBazuOcena();
		izracunajProsecneOcene();
		//System.out.println("Uspesno isparsirano!");
		
	}
	
	private void izracunajProsecneOcene() {
		for (Film film : filmovi) {
			film.izracunajProsecnuOcenu();
		}
	}
	
	private void ucitajBazuFilmova() {
		try {
			FileReader load = new FileReader("filmovi.txt");
			BufferedReader buffer = new BufferedReader(load);
			String line;
			while((line = buffer.readLine()) != null) {
				String parseMain[] = line.split(";");
				Film film = new Film(parseMain[1], Integer.parseInt(parseMain[1]), parseMain[2], parseMain[3], parseMain[4], Integer.parseInt(parseMain[5]));
				filmovi.add(film);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void ucitajBazuOcena() {
		try {
			FileReader load = new FileReader("ocene.txt");
			BufferedReader buffer = new BufferedReader(load);
			String line;
			while((line = buffer.readLine()) != null) {
				String parseMain[] = line.split(";");
				Ocena ocena = new Ocena(Integer.parseInt(parseMain[1]), Integer.parseInt(parseMain[0]), parseMain[2]);
				
				for (Film film : filmovi) {
					if(film.getIdFilm() == ocena.getIdOcena()) {
						film.getOcene().add(ocena);
					}
				}
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Baza getInstance() {
		if(instance == null) instance = new Baza();
		return instance;
	}
	
}
