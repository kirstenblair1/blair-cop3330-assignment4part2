package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import ucf.assignments.MainApp;
import java.io.IOException;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kirsten Blair
 */


public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Todo List");
            stage.setScene(scene);
            stage.show();
        }catch (IOException io)
        {
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}