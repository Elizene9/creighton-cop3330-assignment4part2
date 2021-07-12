/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class IncompleteController {

    // Text area to be updated
    @FXML
    public TextArea TitleDisplay = new TextArea();

    // Exit app
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

    // Temporary variables
    String text;
    int o = 0;

    // Displays only items that don't have a status of complete
    public void Print(ActionEvent actionEvent) throws IOException {
        TitleDisplay.setText("");

        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {
            if (!itemAttributes.status[i].equals("complete")){
                text = "Item #" + (o + 1);
                TitleDisplay.appendText(text);
                TitleDisplay.appendText("\n");
                TitleDisplay.appendText("Name: ");
                TitleDisplay.appendText(itemAttributes.getToDoListTitle().get(i));
                TitleDisplay.appendText("\nDescription: ");
                TitleDisplay.appendText(itemAttributes.getToDoListDescription().get(i));
                TitleDisplay.appendText("\nDue Date: ");
                TitleDisplay.appendText(itemAttributes.getToDoListDueDate().get(i));
                TitleDisplay.appendText("\n\n");
                o++;
            }
        }
        ChangeScenes.Change(ViewScenes.Incomplete);
    }
}
