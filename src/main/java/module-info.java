module hw.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens hw.example.demo to javafx.fxml;
    exports hw.example.demo;
}