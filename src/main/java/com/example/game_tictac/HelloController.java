package com.example.game_tictac;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {
    private char nowSym = 'X';
    private char gameField[][] = new char[3][3];
    private boolean isGame = true;

    @FXML
    void btnClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (!isGame || button.getText() != "") {
            return;
        }

        int rowIndex = GridPane.getRowIndex(button) == null ? 0 : GridPane.getRowIndex(button);
        int columIndex = GridPane.getColumnIndex(button) == null ? 0 : GridPane.getColumnIndex(button);

        gameField[rowIndex][columIndex] = nowSym;

        button.setText(String.valueOf(nowSym));
        if (gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] && (gameField[0][0] == 'X' || gameField[0][0] == 'O')) {
            isGame = false;
        }
        if (gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] && (gameField[1][0] == 'X' || gameField[1][0] == 'O')) {
            isGame = false;
        }
        if (gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] && (gameField[2][0] == 'X' || gameField[2][0] == 'O')) {
            isGame = false;
        }
        if (gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] && (gameField[0][0] == 'X' || gameField[0][0] == 'O')) {
            isGame = false;
        }
        if (gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[2][1] && (gameField[0][1] == 'X' || gameField[0][1] == 'O')) {
            isGame = false;
        }
        if (gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] && (gameField[0][2] == 'X' || gameField[0][2] == 'O')) {
            isGame = false;
        }
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] && (gameField[0][0] == 'X' || gameField[0][0] == 'O')) {
            isGame = false;
        }
        if (gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2] && (gameField[2][0] == 'X' || gameField[2][0] == 'O')) {
            isGame = false;
        }
        nowSym = nowSym == 'X' ? 'O' : 'X';
    }

}


