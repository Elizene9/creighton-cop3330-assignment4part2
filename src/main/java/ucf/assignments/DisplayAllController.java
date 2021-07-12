/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class DisplayAllController {

    // Text area where list is displayed
    @FXML
    public TextArea TitleDisplay = new TextArea();

    // Temporarily holds text to append to text area
    String text;

    // Allows access to to-do list
    itemAttributes call = new itemAttributes();

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

    // Displays all items in list
    public void Print(ActionEvent actionEvent) {
        //System.out.println(call.title);
        TitleDisplay.setText("");
        for (int i = 0; i < call.getToDoListTitle().size(); i++) {
            text = "Item #" + (i + 1);
            TitleDisplay.appendText(text);
            TitleDisplay.appendText("\n");
            TitleDisplay.appendText("Name: ");
            TitleDisplay.appendText(call.getToDoListTitle().get(i));
            TitleDisplay.appendText("\nDescription: ");
            TitleDisplay.appendText(call.getToDoListDescription().get(i));
            TitleDisplay.appendText("\nDue Date: ");
            TitleDisplay.appendText(call.getToDoListDueDate().get(i));
            TitleDisplay.appendText("\n\n");
        }
    }
}
