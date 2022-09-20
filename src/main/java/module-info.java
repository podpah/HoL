module com.example.hol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hol to javafx.fxml;
    exports com.example.hol;
}