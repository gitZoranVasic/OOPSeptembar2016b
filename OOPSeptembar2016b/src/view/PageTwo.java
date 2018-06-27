package view;

import java.awt.Button;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Baza;
import model.Film;

public class PageTwo extends Stage{

	Label lblNaslov, lblGodina, lblZanr, lblReziser, lblGlumci;
	TextField tfOcena, tfKomentar;
	
	Baza baza;
	PageOne pageOne;
	
	public PageTwo(Baza baza, PageOne pageOne) {
		
		this.baza = baza;
		this.pageOne = pageOne;
		Film film = pageOne.getTvFilmovi().getSelectionModel().getSelectedItem();
		
		lblNaslov = new Label("Naslov: " + film.getNaslov());
		lblGodina = new Label("Godina: " + film.getGodinaProizvodnje());
		lblZanr = new Label("Zanr: " + film.getZanr());
		lblReziser = new Label("Reziser: " + film.getReziser());
		lblGlumci = new Label("Glumci: " + film.getGlumci());
		
		tfKomentar = new TextField();
		tfOcena = new TextField();
		
		VBox mainLayout = new VBox(10);
		
			
			
			
			mainLayout.getChildren().addAll(lblNaslov,
											lblGodina,
											lblZanr,
											lblReziser,
											lblGlumci);
			
		GridPane gpLayout = new GridPane();
		
			//column 1
			gpLayout.add(new Label("Ocena:"), 0, 0);
			gpLayout.add(new Label("Komentar: "), 0, 2);
			
			//column 2
			gpLayout.add(tfOcena, 1, 0);
			gpLayout.add(tfKomentar, 1, 1, 1, 2);
			
			//property
			gpLayout.setAlignment(Pos.CENTER);
			gpLayout.setHgap(60);
			gpLayout.setVgap(10);
			gpLayout.setPadding(new Insets(30,0,0,0));
			
			//	BUTTONI ANONIMNO!!!
			
		Button btnSacuvaj = new Button("Sacuvaj ocenu!");
		Button btnOtkazi = new Button("Otkazi");
		
			
		mainLayout.getChildren().add(gpLayout);
		
		
			
		mainLayout.setAlignment(Pos.CENTER_LEFT);
		mainLayout.setPadding(new Insets(40));
		
		Scene sc = new Scene(mainLayout);

		setScene(sc);
		show();
		
		
		
	}

	public Label getLblNaslov() {
		return lblNaslov;
	}

	public Label getLblGodina() {
		return lblGodina;
	}

	public Label getLblZanr() {
		return lblZanr;
	}

	public Label getLblReziser() {
		return lblReziser;
	}

	public Label getLblGlumci() {
		return lblGlumci;
	}

	public TextField getTfOcena() {
		return tfOcena;
	}

	public TextField getTfKomentar() {
		return tfKomentar;
	}

	public Baza getBaza() {
		return baza;
	}

	public PageOne getPageOne() {
		return pageOne;
	}
	
}
