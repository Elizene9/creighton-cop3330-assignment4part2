/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DeleteItemController {

    // Holds user's entered data from textfield
    @FXML
    public TextField ItemTitle = new TextField();

    // Menu
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Exit app
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Displays items in list
    public void DisplayAllPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.DisplayAll);
    }

    // Help Menu
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }

    // Processes item title to delete that item from the list
    public void ItemTitleEntered(ActionEvent actionEvent) {
        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {

            if (itemAttributes.getToDoListTitle().get(i).equals(ItemTitle.getText())) {
                itemAttributes.getToDoListTitle().remove(i);

                itemAttributes.getToDoListDueDate().remove(i);

                itemAttributes.getToDoListDescription().remove(i);

            }
    } }
}
