module com.example.eventplanningproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.eventplanningproject to javafx.fxml;
    exports com.example.eventplanningproject;
    exports com.example.eventplanningproject.Server;
    opens com.example.eventplanningproject.Server to javafx.fxml;
}