package com.example.game_tictac;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainBtn;
    @FXML
    private Button mainBtn2;

    @FXML
    private Label mainLabel;

    @FXML
    void btnClk(ActionEvent event) {
    mainLabel.setText("зачем ты нажал на кнопку!!!");
    }
    @FXML
    void btnClk2(ActionEvent event) {
        mainLabel.setText("Хватит жать!!!");
    }

}
