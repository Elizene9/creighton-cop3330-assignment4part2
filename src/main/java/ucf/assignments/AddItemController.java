/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;

public class AddItemController {

    // Access text fields from corresponding FXML file
    @FXML public TextField ItemTitle = new TextField();
    @FXML public TextField ItemDescription = new TextField();
    @FXML public TextField ItemDate = new TextField();

    // Strings to hold user input data from text fields
    private String itemTitle;
    private String itemDecription;
    private String itemDate;

    // Variable to access to do list
    itemAttributes use = new itemAttributes();

    // Saves title to be added to list
    public void ItemTitleEntered(ActionEvent actionEvent) {
        itemTitle = ItemTitle.getText();
    }

    // Saves description to be added to list
    public void ItemDescEntered(ActionEvent actionEvent) {
        itemDecription = ItemDescription.getText();
    }

    // Saves due date to be added to list
    public void ItemDateEntered(ActionEvent actionEvent) {

        itemDate = ItemDate.getText();
    }

    // Switches to front menu if user clicks menu button
    public void MenuButtonPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.LaunchApp);
    }

    // Exits application when user clicks exit
    public void ExitPressed(ActionEvent actionEvent) {
        System.exit(0);
    }

    // Saves item to list when user clicks save
    public void SaveItemPressed(ActionEvent actionEvent) throws IOException {
        use.getToDoListTitle().add(ItemTitle.getText());
        use.getToDoListDescription().add(ItemDescription.getText());
        use.getToDoListDueDate().add(ItemDate.getText());
    }

    // Shows help screen when user clicks help
    public void HelpPressed(ActionEvent actionEvent) throws IOException {
        ChangeScenes.Change(ViewScenes.HelpScreen);
    }
}
