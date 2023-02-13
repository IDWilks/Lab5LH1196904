package com.example.lab5lh1196904;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class PhoneViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
        Phone iPhone = new Phone("iphone14pro", "Lab5LH1196904/src/main/resources/com/example/lab5lh1196904/Images/iPhone14Pro-SpaceBlack-pos1.png");
    }

}