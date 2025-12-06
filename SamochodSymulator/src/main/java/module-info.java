module pl.nikodem.samochod {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.nikodem.samochod to javafx.fxml;
    exports pl.nikodem.samochod;
}