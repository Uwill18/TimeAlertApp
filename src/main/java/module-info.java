module com.example.timealertapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.timealertapp to javafx.fxml;
    exports com.example.timealertapp;
}