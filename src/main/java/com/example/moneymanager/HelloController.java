package com.example.moneymanager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {

    @FXML
    private Button getdata;

    @FXML
    private Button savedata;

    @FXML
    private TextArea showdata;

    @FXML
    void get(MouseEvent event) {
        File file = FileChooser.showSaveDialog(new Stage());
        if(file != null) {

        }
    }

    @FXML
    void save(MouseEvent event) {

    }

}
