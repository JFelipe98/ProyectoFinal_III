module com.example.proyectofinaliii {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectofinaliii to javafx.fxml;
    exports com.example.proyectofinaliii;
}