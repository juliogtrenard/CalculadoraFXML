package es.juliogtrenard.calculadorafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación de calculadora.
 * Extiende de Application para crear una aplicación JavaFX.
 */
public class HelloApplication extends Application {
    
    /**
     * Método que inicia la aplicación JavaFX.
     * Carga el archivo FXML, configura la escena y muestra la ventana principal.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        launch();
    }
}