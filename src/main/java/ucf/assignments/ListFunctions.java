/*
 * UCF COP 3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import java.util.ArrayList;
import java.util.List;

// Performs any list function
public class ListFunctions {

    // Stores all to do lists
    public ArrayList<listAttributes> ToDo = new ArrayList<listAttributes>(100);

    // Stores single list of items
    public List<itemAttributes>  list = new ArrayList<>();

    // Adds new to-do list
    public ArrayList<listAttributes> AddList(List<itemAttributes> list, String title) {
        // This method adds user's list to ArrayList to-do by taking title of list and
        // the list of all its items and their attributes
        return ToDo;
    }

    // Deletes a to-do list
    public ArrayList<listAttributes> DeleteList(int index) {
        // This method takes index of list to be deleted and deletes this list from ArrayList ToDo
        return ToDo;
    }

    // Edits title of to do list
    public ArrayList<listAttributes> EditTitle(int index, String newTitle) {
        // Takes index of to do list in ArrayList and edits its title
        return ToDo;
    }

    // Adds item to particular to do list
    public List<itemAttributes> AddItem(itemAttributes item) {
        // This function takes in item Attributes (title, description, due date, status) and adds them to list
        return list;
    }

    // Deletes item from a list
    public List<itemAttributes> DeleteItem(itemAttributes item, String ListTitle) {
        // This method uses the ListTitle variable to find the correct list and then traverses that list to remove the item from that to-do List
        return list;
    }

    // Edits description of an item in a list
    public String EditDescription(itemAttributes item, String ListTitle) {
        // This method uses the ListTitle variable to find the correct list and then traverses that list to edit the item description in that to-do List
        return item.description;
    }

    // Edits Due Date of an item in a list
    public String EditDueDate (itemAttributes item, String ListTitle) {
        // This method uses the ListTitle variable to find the correct list and then traverses that list to edit the item due date in that to-do List
        return item.dueDate;
    }

    // Saves a single list
    public void SaveOneList(String title) {
        // Traverses ArrayList To-Do to find to-do list with same title as passed in parameter and saves that list to storage (.txt)
    }

    // Loads a single list
    public void LoadOneList(String title) {
        // Loads list previously saved to storage for user and accesses list using title parameter
    }

    // Saves All To-Do Lists
    public void SaveAllLists() {
        // Saves all lists in ArrayList to storage
    }

    // Loads Multiple Lists at user's discretion
    public void LoadMultipleLists(int[] array) {
        // Loads list previously saved to storage for user and accesses list using integer array to get the indices of these lists
    }

    // Displays all to-do lists
    public ArrayList<listAttributes> DisplayAllItems(String title) {
        // Shows all items in List
        return ToDo;
    }

    // Displays only completed items in list
    public List<itemAttributes> DisplayCompleted(int ListIndex) {
        // Traverses List at Arraylist.get(ListIndex) for the status of each item in the list and displays complete items only
        return ToDo.get(0).list;
    }

    // Displays only incomplete items in list
    public List<itemAttributes> DisplayIncomplete(int ListIndex) {
        // Traverses List at Arraylist.get(ListIndex) for the status of each item in the list and displays incomplete items only
        return ToDo.get(0).list;
    }

    // Marks items as complete
    public String ItemComplete(itemAttributes item, int index) {
        // Updates status (itemAttribute) of the items the user marks as complete
        // and takes the index of the ArrayList to find list that items are in
        return item.status;
    }
}
