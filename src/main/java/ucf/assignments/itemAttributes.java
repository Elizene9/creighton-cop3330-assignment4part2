/*
* UCF COP 3330 Summer 2021 Assignment 4 Solution
* Copyright 2021 Charlene Creighton
 */

package ucf.assignments;

import java.util.ArrayList;
import java.util.List;

// Sets all item attributes
public class itemAttributes {

    // List items to be updated
    public static String title;
    public static String description;
    public static String dueDate;
    public static String[] status = new String[500];

    // List of strings to store all titles, descriptions, and dates
    private static List<String> ToDoListTitle = new ArrayList<>();
    private static List<String> ToDoListDescription = new ArrayList<>();
    private static List<String> ToDoListDueDate = new ArrayList<>();

    // Setters and getters allowing access to lists
    public static void setToDoListTitle(List<String> toDoListTitle) {
        ToDoListTitle = toDoListTitle;
    }

    public static List<String> getToDoListTitle() {
        return ToDoListTitle;
    }

    public static List<String> getToDoListDescription() {
        return ToDoListDescription;
    }

    public static List<String> getToDoListDueDate() {
        return ToDoListDueDate;
    }

    public static void setToDoListDescription(List<String> toDoListDescription) {
        ToDoListDescription = toDoListDescription;
    }

    public static void setToDoListDueDate(List<String> toDoListDueDate) {
        ToDoListDueDate = toDoListDueDate;
    }

}
