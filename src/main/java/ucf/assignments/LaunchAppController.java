/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;

// Controls all buttons and text boxes in FXML
public class LaunchAppController {

    // Method ensures system is exited when application exit button is pressed
    public void ExitPressed(ActionEvent actionEvent) {
        // Exits application
    }

    // Called if user clicks to add to-do list
    public void AddToDoPressed(ActionEvent actionEvent) {
        // Uses AddList in ListFunctions
    }

    // Called if user clicks to delete list
    public void DeleteToDoPressed(ActionEvent actionEvent) {
        // Uses DeleteList in ListFunctions
    }

    // Called if user clicks to edit list title
    public void EditToDoTitle(ActionEvent actionEvent) {
        // Uses EditTitle in ListFunctions
    }

    // Called if user clicks to add item to list
    public void AddItemPressed(ActionEvent actionEvent) {
        // Uses AddItem in ListFunctions
    }

    // Called if user clicks to delete item from list
    public void DeleteItemPressed(ActionEvent actionEvent) {
        // Uses DeleteItem in ListFunctions
    }

    // Called if user clicks to edit item description
    public void EditDescriptionPressed(ActionEvent actionEvent) {
        // Uses EditDescription in ListFunctions
    }

    // Called if user clicks to edit due date
    public void DueDatePressed(ActionEvent actionEvent) {
        // Uses EditDueDate in ListFunctions
    }

    // Called if user clicks to save single list
    public void SaveOneListPressed(ActionEvent actionEvent) {
        // Uses SaveOneList in ListFunctions
    }

    // Called if user clicks to load single list
    public void LoadOneListPressed(ActionEvent actionEvent) {
        // Uses LoadOneList in ListFunctions
    }

    // Called if user clicks to save all lists to external storage
    public void SaveAllListsPressed(ActionEvent actionEvent) {
        // uses SaveAllLists in ListFunctions
    }

    // Called if user clicks to load more than one list
    public void LoadMultipleListsPressed(ActionEvent actionEvent) {
        // uses LoadMultipleLists in ListFunctions
    }

    // Called if user clicks to display all items in List
    public void DisplayAllItemsPressed(ActionEvent actionEvent) {
        // Uses DisplayAllItems in ListFunctions
    }

    // Called if user clicks to display only completed items
    public void DisplayCompletedPressed(ActionEvent actionEvent) {
        // Uses DisplayCompleted in ListFunctions
    }

    // Called if user clicks to display only incomplete items
    public void DisplayIncompletePressed(ActionEvent actionEvent) {
        // Uses DisplayIncomplete in ListFunctions
    }

    // Called if user checks off item in list
    public void ItemCompleteChecked(ActionEvent actionEvent) {
        // Uses ItemComplete in ListFunctions
    }

    // User enters title of to-do list after clicking
    public void ListTitleEntered(ActionEvent actionEvent) {

    }

    // User views menu (first page of application)
    public void MenuButtonPressed(ActionEvent actionEvent) {
    }

    // user deletes item by typing
    public void DeleteItemTyped(ActionEvent actionEvent) {
    }

    // User enters old title
    public void OldToDoTitleTyped(ActionEvent actionEvent) {
    }

    // User enters new title
    public void NewToDoTitleTyped(ActionEvent actionEvent) {
    }

    // User enters item title
    public void ItemTitleEntered(ActionEvent actionEvent) {
    }

    // User enters description title
    public void ItemDescEntered(ActionEvent actionEvent) {
    }

    // User enters item due date
    public void ItemDateEntered(ActionEvent actionEvent) {
    }

    // User enters new description
    public void NewDescriptionEntered(ActionEvent actionEvent) {
    }

    // User enters new date
    public void NewDateEntered(ActionEvent actionEvent) {
    }

    // User saves one list by entering its title
    public void SaveListTitleEntered(ActionEvent actionEvent) {
    }

    // User displays all items in to-do list by entering title
    public void DisplayTitleEntered(ActionEvent actionEvent) {
    }

    // User checks off items they completed
    public void CompleteChecked(ActionEvent actionEvent) {
    }

    // User types number of lists they want to load
    public void NumListTyped(ActionEvent actionEvent) {
    }
}
