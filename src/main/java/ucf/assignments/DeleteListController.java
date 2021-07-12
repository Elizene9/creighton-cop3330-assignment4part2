/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DeleteListController {

    // Exit app
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Return to menu
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Completely clears list on action
    public void ClearList(ActionEvent actionEvent) {
            itemAttributes.getToDoListDescription().clear();
            itemAttributes.getToDoListDueDate().clear();
            itemAttributes.getToDoListTitle().clear();
    }

    // Help menu
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }
}
