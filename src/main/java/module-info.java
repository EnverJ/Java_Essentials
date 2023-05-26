module com.example.java_essential_2023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_essential_2023 to javafx.fxml;
    exports com.example.java_essential_2023;
}