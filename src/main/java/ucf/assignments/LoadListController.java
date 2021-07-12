/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LoadListController {

    // Text area to be updated and text field where user will type their chosen filename
    @FXML
    public TextArea TitleDisplay = new TextArea();
    @FXML
    public TextField fileName = new TextField();

    // File scanner
    Scanner file;

    // Menu
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Exit app
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Help Menu
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }

    // Creates file when user enters file name
    public void fileNameTyped(ActionEvent actionEvent) throws IOException {
        file = new Scanner(new File(fileName.getText()));
    }

    // Loads and displays list upon click
    public void LoadPressed(ActionEvent actionEvent) {

        TitleDisplay.setText("");
        while (file.hasNext()) {

                TitleDisplay.appendText(file.nextLine());
                TitleDisplay.appendText("\n");


        }
        file.close();
    }
}
