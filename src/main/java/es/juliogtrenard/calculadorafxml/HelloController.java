package es.juliogtrenard.calculadorafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private TextField txtResultado;

    @FXML
    private Button btnCalcular;

    @FXML
    private RadioButton rbSumar;

    @FXML
    private RadioButton rbRestar;

    @FXML
    private RadioButton rbMultiplicar;

    @FXML
    private RadioButton rbDividir;

    @FXML
    private ToggleGroup tgOperacion;

    @FXML
    protected void onHelloButtonClick() {

    }
}