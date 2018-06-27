package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Baza;
import view.PageOne;

public class BtnPretraziController implements EventHandler<ActionEvent> {
	
	Baza baza;
	PageOne pageOne;
	
	public BtnPretraziController(Baza baza, PageOne pageOne) {
		this.baza = baza;
		this.pageOne = pageOne;
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		pageOne.getTvFilmovi().setItems(baza.filtrirajFilmove(pageOne.getRbTacanNaslov().isSelected(), pageOne.getTfNaslov().getText()));
		
	}

}
