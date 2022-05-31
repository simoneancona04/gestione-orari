module com.gestioneorari {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;

    opens com.gestioneorari to javafx.fxml;
    exports com.gestioneorari;
}
