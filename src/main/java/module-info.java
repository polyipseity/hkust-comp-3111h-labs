module lab3.comp3111jfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens lab3.comp3111jfx to javafx.fxml;
    exports lab3.comp3111jfx;
}