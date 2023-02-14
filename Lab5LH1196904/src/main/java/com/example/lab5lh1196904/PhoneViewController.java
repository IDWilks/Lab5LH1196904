package com.example.lab5lh1196904;

import com.example.lab5lh1196904.Phone;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PhoneViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    public ImageView phoneImage;
    @FXML
    public Label phoneModel;

    @FXML
    void initialize() {
        Phone iPhone = new Phone("iphone14pro", "Images/iPhone14Pro-SpaceBlack-pos1.png");
        phoneImage = Phone.getImage(iPhone);
        phoneModel = Phone.getLabel(iPhone);

    }
}