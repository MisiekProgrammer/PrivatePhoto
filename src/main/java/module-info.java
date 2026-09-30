module pl.misiekprogrammer.privatephoto {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;


    opens pl.misiekprogrammer.privatephoto to javafx.fxml;
    exports pl.misiekprogrammer.privatephoto;
}