package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Baza;
import model.Film;

public class PageOne extends Stage{

	private Baza baza;

    private static PageOne instance = null;

    private TextField tfNaslov;
    private ToggleGroup rbGroup;
    private RadioButton rbTacanNaslov;
    private RadioButton rbDeoNaslova;
    private Button btnPretrazi;
    private Button btnOceni;

    private TableView<Film> tvFilmovi;

    public PageOne(Baza baza) {
        this.baza = baza;
        tfNaslov = new TextField();
        
        rbGroup = new ToggleGroup();
        
        rbTacanNaslov = new RadioButton("Tacan naslov");
        	rbTacanNaslov.setToggleGroup(rbGroup);
        	rbTacanNaslov.setSelected(true);
        	
        rbDeoNaslova = new RadioButton("Deo naslova");
        	rbDeoNaslova.setToggleGroup(rbGroup);
        	
        btnPretrazi = new Button("Pretrazi");
        btnOceni = new Button("Oceni");
        tvFilmovi = new TableView<>();

        VBox mainLayout = new VBox(20);

        GridPane upLayout = new GridPane();
            //collum 0
            upLayout.add(new Label("Naslov: "), 0, 0);
            upLayout.add(rbTacanNaslov, 0, 1);
            upLayout.add(btnPretrazi, 0, 2);
            //collum 1
            upLayout.add(tfNaslov, 1, 0);
            upLayout.add(rbDeoNaslova, 1, 1);
                upLayout.setAlignment(Pos.CENTER);
                upLayout.setHgap(10);
                upLayout.setVgap(14);

        mainLayout.getChildren().addAll(upLayout, tvFilmovi, btnOceni);
            mainLayout.setAlignment(Pos.CENTER);
            mainLayout.setPadding(new Insets(20));

        Scene sc = new Scene(mainLayout);
        setScene(sc);
        setHeight(500);
        setWidth(480);
        show();
        
    }

    public Baza getBaza() {
		return baza;
	}

	public static PageOne getInstance() {
		return instance;
	}

	public TextField getTfNaslov() {
		return tfNaslov;
	}

	public ToggleGroup getRbGroup() {
		return rbGroup;
	}

	public RadioButton getRbTacanNaslov() {
		return rbTacanNaslov;
	}

	public RadioButton getRbDeoNaslova() {
		return rbDeoNaslova;
	}

	public Button getBtnPretrazi() {
		return btnPretrazi;
	}

	public Button getBtnOceni() {
		return btnOceni;
	}

	public TableView<Film> getTvFilmovi() {
		return tvFilmovi;
	}

	public static PageOne getInstance(Baza baza) {
        if(instance == null) instance = new PageOne(baza);
        return instance;
    }
	
}
