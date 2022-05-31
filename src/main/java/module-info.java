module com.gestioneorari {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gestioneorari to javafx.fxml;
    exports com.gestioneorari;
}
