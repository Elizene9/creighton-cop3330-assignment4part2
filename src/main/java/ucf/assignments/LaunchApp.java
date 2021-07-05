/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LaunchApp extends Application {

    // Main class launched
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Launch application at runtime, creates first page of application and shows it when run
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LaunchApp.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("LaunchApp");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
