/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LaunchApp extends Application {

    // Main class launched
    public static void main(String[] args) {

        // Set all statuses to have no value
        for (int i = 0; i < 500; i++)
            itemAttributes.status[i] ="";
            launch(args);
    }

    // Load first scene of app
    @Override
    public void start(Stage primaryStage) throws IOException {

        // Launch application at runtime, creates first page of application and shows it when run
        var scene = new Scene(new Pane());

        ChangeScenes.stageScene(scene);
        ChangeScenes.Change(ViewScenes.LaunchApp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
