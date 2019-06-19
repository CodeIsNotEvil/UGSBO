module UGSBO {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ugsbo.gui to javafx.fxml;

    exports com.ugsbo.gui;
}