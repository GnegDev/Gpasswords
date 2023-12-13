module com.gnegdev.gpasswords {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gnegdev.gpasswords to javafx.fxml;
    exports com.gnegdev.gpasswords;
}