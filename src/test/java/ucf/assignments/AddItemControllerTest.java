package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddItemControllerTest {

    @Test
    void ItemsAddedToListProperly() {

        itemAttributes use = new itemAttributes();

        String item1 = "Routine";
        String item2 = "Get up in the morning";
        String item3 = "12-18-2021";

        use.getToDoListTitle().add(item1);
        use.getToDoListDescription().add(item2);
        use.getToDoListDueDate().add(item3);

        assertEquals(item1,use.getToDoListTitle().get(0));
        assertEquals(item2,use.getToDoListDescription().get(0));
        assertEquals(item3,use.getToDoListDueDate().get(0));

    }
}