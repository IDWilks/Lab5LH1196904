package com.example.lab5lh1196904;

import java.io.File;

public class Phone {
    private String model;
    private static String path;

    public Phone(String model, String path) {
        this.model = model;
        this.path = path;
    }

    public File IgetImage(){
        File phoneImage = new File(Phone.path);
        return phoneImage;
    }
}
