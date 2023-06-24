module main.mainscreen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens main.mainscreen to javafx.fxml;
    exports main.mainscreen;
}