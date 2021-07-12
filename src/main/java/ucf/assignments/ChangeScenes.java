/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ChangeScenes {

    // Creates new scene
    public static Scene scene;

    // Allows scenes to be changed
    public static void stageScene(Scene scene) {

        ChangeScenes.scene = scene;
    }

    // Loads next scene
    public static void Change(ViewScenes view) throws IOException {

        Parent root = FXMLLoader.load(ChangeScenes.class.getResource(view.getFile()));

        scene.setRoot(root);
    }


}
