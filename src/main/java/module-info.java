module com.example.game_tictac {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game_tictac to javafx.fxml;
    exports com.example.game_tictac;
}