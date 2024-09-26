package es.juliogtrenard.calculadorafxml;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    protected void handleButtonAction() {
        try {
            float num1 = Float.parseFloat(txtNum1.getText());

            float num2 = Float.parseFloat(txtNum2.getText());

            if(rbSumar.isSelected()) {
                float resultado = num1 + num2;

                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbRestar.isSelected()) {
                float resultado = num1 - num2;

                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbDividir.isSelected()) {
                float resultado = num1 / num2;

                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbMultiplicar.isSelected()) {
                float resultado = num1 * num2;

                txtResultado.setText(String.valueOf(resultado));
            }
        } catch (NumberFormatException n) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ingresa únicamente números para realizar la operación");
            alert.show();
            txtNum1.clear();
            txtNum2.clear();
        } catch (ArithmeticException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No puedes dividir por 0!");
            alert.show();
            txtNum1.clear();
            txtNum2.clear();
        }
    }
}