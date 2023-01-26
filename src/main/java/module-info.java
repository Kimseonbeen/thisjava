module com.example.thisjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thisjava to javafx.fxml;
    exports com.example.thisjava;
}