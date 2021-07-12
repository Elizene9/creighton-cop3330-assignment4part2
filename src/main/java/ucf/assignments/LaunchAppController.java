/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;

import java.io.IOException;

// Controls all buttons and text boxes in FXML
public class LaunchAppController {
    
    // Method ensures system is exited when application exit button is pressed
    public void ExitPressed() {
        // Exits application
        System.exit(0);
    }

    // Each of these methods take you to their respective scenes upon a button click
    public void DeleteToDoPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.DeleteList);
    }

    public void EditToDoTitle(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.EditDetails);
    }

    public void AddItemPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.AddItem);
    }

    public void DeleteItemPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.DeleteItem);
    }

    public void EditDescriptionPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.EditDetails);
    }

    public void DueDatePressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.EditDetails);
    }

    public void SaveOneListPressed(ActionEvent actionEvent) throws IOException {

        ChangeScenes.Change(ViewScenes.SaveOneList);
    }

    public void LoadOneListPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LoadList);
    }

    public void DisplayAllItemsPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.DisplayAll);
    }

    public void DisplayCompletedPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.Complete);
    }

    public void DisplayIncompletePressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.Incomplete);
    }

    public void MarkComplete(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.MarkComplete);
    }

    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }


}
