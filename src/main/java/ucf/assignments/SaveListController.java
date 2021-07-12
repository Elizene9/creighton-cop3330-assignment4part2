/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.*;

public class SaveListController {

    // Create file, file writer, and string to store file name
    @FXML
    public TextField fileName = new TextField();
    public FileWriter writer;
    String filename;

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

    // Saves list to file with name user has entered
    public void SavePressed(ActionEvent actionEvent) throws IOException {

        writer = new FileWriter(filename);
        writer.write("List:\n");
        for (int i = 0; i < itemAttributes.getToDoListTitle().size(); i++) {

            writer.write("Item #");
            writer.write(Integer.toString(i+1));
            writer.write("\nTitle: ");
            writer.write(itemAttributes.getToDoListTitle().get(i));
            writer.write("\nDescription: ");
            writer.append(itemAttributes.getToDoListDescription().get(i));
            writer.append("\nDue Date: ");
            writer.append(itemAttributes.getToDoListDueDate().get(i));
            writer.append("\n\n");
        }
        writer.close();
    }

    // Process user input and store it in filename variable
    public void fileNamePressed(ActionEvent actionEvent) {
        filename = fileName.getText() + ".txt";
    }
}
