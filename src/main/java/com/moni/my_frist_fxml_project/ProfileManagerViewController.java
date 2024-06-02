package com.moni.my_frist_fxml_project;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfileManagerViewController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextArea textAreaFXID;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goButtonClick(ActionEvent actionEvent) {
        textAreaFXID.setText("we learned a lot today");

    }
}