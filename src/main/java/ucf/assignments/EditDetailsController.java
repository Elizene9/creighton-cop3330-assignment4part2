/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EditDetailsController {

    // Text field's with user's old and new data
    @FXML
    public TextField oldTitle = new TextField();
    @FXML
    public TextField oldDescription = new TextField();
    @FXML
    public TextField oldDate = new TextField();
    @FXML
    public TextField newTitle = new TextField();
    @FXML
    public TextField newDescription = new TextField();
    @FXML
    public TextField newDate = new TextField();

    // Strings to temporarily store unedited and edited data
    private String OldTitle;
    private String OldDescription;
    private String OlddueDate;
    private String NewTitle;
    private String NewDescription;
    private String NewdueDate;

    // Accesses to-do list
    itemAttributes call = new itemAttributes();

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

    // Switches to display all scene
    public void DisplayAllPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.DisplayAll);
    }

    // Updates list with new info
    public void EditPressed(ActionEvent actionEvent) {

        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {

            if (itemAttributes.getToDoListTitle().get(i).equals(OldTitle)) {
                itemAttributes.getToDoListTitle().set(i, NewTitle);
            }

            if (itemAttributes.getToDoListDescription().get(i).equals(OldDescription))
                itemAttributes.getToDoListDescription().set(i, NewDescription);

            if (itemAttributes.getToDoListDueDate().get(i).equals(OlddueDate))
                itemAttributes.getToDoListDueDate().set(i, NewdueDate);

        }
    }

    // These methods receive the old data and enter new data
    public void NewItemTitleEntered(ActionEvent actionEvent) {
        NewTitle = newTitle.getText();
    }

    public void NewItemDescEntered(ActionEvent actionEvent) {
        NewDescription = newDescription.getText();
    }

    public void NewItemDateEntered(ActionEvent actionEvent) {
        NewdueDate = newDate.getText();
    }

    public void OldItemTitleEntered(ActionEvent actionEvent) {
        OldTitle = oldTitle.getText();
    }

    public void OldItemDescEntered(ActionEvent actionEvent) {
        OldDescription = oldDescription.getText();
    }

    public void OldItemDateEntered(ActionEvent actionEvent) {
        OlddueDate = oldDate.getText();
    }
}
