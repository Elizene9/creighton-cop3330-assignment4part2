/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MarkCompleteController {

    // User enters title of item to be marked as complete
    @FXML
    public TextField ItemTitle = new TextField();

    // exit app
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Menu
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Help Menu
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }

    // Display all items
    public void DisplayAllPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.Complete);
    }

    // Processes user entry data
    public void ItemTitleEntered(ActionEvent actionEvent) {

        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {

            if (itemAttributes.getToDoListTitle().get(i).equals(ItemTitle.getText())) {

                itemAttributes.status[i] = "complete";
            }

        }
    }
}
