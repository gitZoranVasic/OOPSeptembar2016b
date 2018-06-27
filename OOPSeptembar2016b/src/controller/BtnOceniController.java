package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Baza;
import model.Film;
import view.PageOne;
import view.PageTwo;

public class BtnOceniController implements EventHandler<ActionEvent>{

	Baza baza;
	PageOne pageOne;
	
	public BtnOceniController(Baza baza, PageOne pageOne) {
		this.baza = baza;
		this.pageOne = pageOne;
	}


	@Override
	public void handle(ActionEvent arg0) {
		PageTwo pageTwo = new PageTwo(baza, pageOne);
	}

	
	
}
