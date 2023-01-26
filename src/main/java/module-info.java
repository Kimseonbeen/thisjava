module com.example.thisjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.thisjava to javafx.fxml;
    exports com.example.thisjava;
}