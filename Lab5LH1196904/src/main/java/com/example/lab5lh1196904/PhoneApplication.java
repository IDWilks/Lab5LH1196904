package com.example.lab5lh1196904;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PhoneApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PhoneApplication.class.getResource("Phone-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Apple IPhone");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}