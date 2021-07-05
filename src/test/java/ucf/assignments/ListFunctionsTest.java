package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListFunctionsTest {

    @Test
    void addListAddsListProperly() {

        /* Create initial Arraylist; pass a newly created list to addList function and a list title
            Create expected returned arrayList and check if this is equal to ArrayList returned by addList
         */
    }

    @Test
    void deleteListDeletesListProperly() {
        /*
        Create new Arraylist and one with newly deleted item; pass initial Arraylist and index of list to delete
        assertEquals if these ArrayLists are equal after deleteListFunction
         */

    }

    @Test
    void editTitleProperlyEditsTitle() {
        /*
        Create new Arraylist and pass index of list to editTitle method and edited title
        do assertEquals with index to check if word passed is reflected in the updated title when
        ArrayList is returned from this method
         */

    }

    @Test
    void addItemUpdatesListCorrectly() {
        /*
        Create list of itemAttribute objects and pass this to addItem method
        Check if returned list and expected list are equal
         */
    }

    @Test
    void deleteItemUpdatesListCorrectly() {
        /*
        Pass item attributes (title, description, due date) and title of list from ArrayList
        Create expected list to be returned and check if deleteItem function returns this list
        through assertEquals
         */
    }

    @Test
    void editDescription() {
        /*
        Pass item attributes (title, description, due date) and title of list from ArrayList
        Create expected list to be returned and check if deleteItem function returns this list
        through assertEquals
         */
    }

    @Test
    void editDueDate() {
        /*
        Pass item attributes (title, description, due date) and title of list from ArrayList
        Create expected list to be returned and check if deleteItem function returns this list
        through assertEquals
         */
    }

    @Test
    void saveOneList() {
        /*
        Check if .txt file with List title is created using boolean flag
         */
    }

    @Test
    void loadOneList() {
        /*
        Text file is read and information is passed to new file type
        Checks if new file is created
         */
    }

    @Test
    void saveAllLists() {
        /*
        Checks if allList.txt is created
        line by line comparison to Arraylist
         */
    }

    @Test
    void loadMultipleLists() {
        /*
        Checks if the lists at each point in the array passed to loadMultipleLists method are loaded
        to new file
         */
    }

    @Test
    void displayAllLists() {
        /*
        Checks if passed ArrayList and returned ArrayList are equal
         */
    }

    @Test
    void OnlyCompletedItemsDisplayed() {
        /*
        Checks if only items in list with a status of "complete" are shown
         */
    }

    @Test
    void OnlyIncompleteItemsDisplayed() {
        /*
        Checks if only items in list with a status of "incomplete" are shown
         */
    }

    @Test
    void itemCorrectlyMarkedAsComplete() {
        /*
        Checks if item previously incomplete passed through this function now has itemAttribute.status of
        "complete"
         */
    }
}