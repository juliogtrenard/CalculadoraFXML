module es.juliogtrenard.calculadorafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.calculadorafxml to javafx.fxml;
    exports es.juliogtrenard.calculadorafxml;
}