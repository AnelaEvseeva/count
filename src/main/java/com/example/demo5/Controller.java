package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label text;

    @FXML
    private TextField textField;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    public void clickButtonOne(ActionEvent eventOne) {
        int value = Integer.parseInt(textField.getText());
        if(value<3){
            value++;
            textField.setText(Integer.toString(value));
    }
}
    public void clickButtonTwo(ActionEvent eventTwo){
        int value1 = Integer.parseInt(textField.getText());
        if(value1>-5){
            --value1;
            textField.setText(Integer.toString(value1));
    }
}}