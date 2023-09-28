module com.example.proyectofinaliii {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectoFinal_III.ViewController;
    exports co.edu.uniquindio.proyectoFinal_III.ViewController;

   opens com.example.proyectofinaliii.viewController;
   exports com.example.proyectofinaliii.viewController;

}