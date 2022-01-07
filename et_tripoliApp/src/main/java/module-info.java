module org.cirdles.et_tripoliapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.cirdles.et_tripoliapp to javafx.fxml;
    exports org.cirdles.et_tripoliapp;
}