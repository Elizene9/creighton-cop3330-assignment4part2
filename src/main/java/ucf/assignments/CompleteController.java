/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class CompleteController {

    // Allows Text area to be edited
    @FXML
    public TextArea TitleDisplay = new TextArea();

    // Takes user to menu when pressed
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Exits application when user clicks exit
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Switches scenes to help menu when help is pressed
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }

    // Holds some of the text to be appended to textArea
    String text;

    // Counter variable
    int o = 0;

    // Only shows items with a status of complete
    public void Print(ActionEvent actionEvent) {
        TitleDisplay.setText("");

        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {
            if (itemAttributes.status[i].equals("complete")){
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

    }
}
