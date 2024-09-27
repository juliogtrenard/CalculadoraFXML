package es.juliogtrenard.calculadorafxml;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Controlador para la interfaz de usuario de la calculadora.
 * Maneja las interacciones del usuario y realiza los cálculos.
 */
public class HelloController {
    /** Campo de texto para el primer número */
    @FXML
    private TextField txtNum1;

    /** Campo de texto para el segundo número */
    @FXML
    private TextField txtNum2;

    /** Campo de texto para mostrar el resultado */
    @FXML
    private TextField txtResultado;

    /** Botón de radio para la operación de suma */
    @FXML
    private RadioButton rbSumar;

    /** Botón de radio para la operación de resta */
    @FXML
    private RadioButton rbRestar;

    /** Botón de radio para la operación de multiplicación */
    @FXML
    private RadioButton rbMultiplicar;

    /** Botón de radio para la operación de división */
    @FXML
    private RadioButton rbDividir;

    /** Grupo para los botones de radio de operaciones */
    @FXML
    private ToggleGroup tgOperacion;

    /**
     * Maneja la acción del botón de calcular.
     * Realiza la operación seleccionada y muestra el resultado.
     * Maneja excepciones para entradas no numéricas y división por cero.
     */
    @FXML
    protected void handleButtonAction() {
        try {
            float num1 = Float.parseFloat(txtNum1.getText());
            float num2 = Float.parseFloat(txtNum2.getText());
            float resultado = 0;

            if(rbSumar.isSelected()) {
                resultado = num1 + num2;
                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbRestar.isSelected()) {
                resultado = num1 - num2;
                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbMultiplicar.isSelected()) {
                resultado = num1 * num2;
                txtResultado.setText(String.valueOf(resultado));
            }

            if(rbDividir.isSelected()) {
                if (Math.abs(num1 / num2) == Double.POSITIVE_INFINITY)
                    throw new ArithmeticException();

                resultado = (float)num1 / num2;
                txtResultado.setText(String.valueOf(resultado));
            }
        } catch (NumberFormatException n) {
            mostrarAlerta("ERROR", "Ingresa únicamente números para realizar la operación");
            limpiarCampos();
        } catch (ArithmeticException ex) {
            mostrarAlerta("ERROR", "No puedes dividir por 0!");
            limpiarCampos();
        }
    }

    /**
     * Muestra una alerta de error con el mensaje especificado.
     * @param titulo El título de la alerta.
     * @param mensaje El mensaje de error a mostrar.
     */
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.show();
    }

    /**
     * Limpia los campos de entrada de números.
     */
    private void limpiarCampos() {
        txtNum1.clear();
        txtNum2.clear();
        txtResultado.clear();
    }
}