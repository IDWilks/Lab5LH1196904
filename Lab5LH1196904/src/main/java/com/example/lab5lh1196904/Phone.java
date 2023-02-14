package com.example.lab5lh1196904;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Phone {
    private String model;
    private String path;

    public Phone(String model, String path) {
        this.model = model;
        this.path = path;
    }

    public static ImageView getImage(Phone phone){
        return new ImageView(new Image(phone.path));
    }
    public static Label getLabel(Phone phone){
        return new Label(phone.model);
    }
}
