/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

public enum ViewScenes {

    // Allows scenes to be switched upon access to this class
    AddItem("AddItem.fxml"),
    Complete("Complete.fxml"),
    DeleteItem("DeleteItem.fxml"),
    DeleteList("DeleteList.fxml"),
    DisplayAll("DisplayAll.fxml"),
    EditDetails("EditDetails.fxml"),
    HelpScreen("HelpScreen.fxml"),
    Incomplete("Incomplete.fxml"),
    LaunchApp("LaunchApp.fxml"),
    LoadList("LoadList.fxml"),
    MarkComplete("MarkComplete.fxml"),
    SaveOneList("SaveOneList.fxml");

    public String file;
    ViewScenes(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }
}
