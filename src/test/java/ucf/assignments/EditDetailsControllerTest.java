package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EditDetailsControllerTest {

    @Test
    void newItemDetailsEditedWhenOldDataIsEntered() {

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");

        list2.add("January");
        list2.add("February");
        list2.add("March");
        list2.add("December");

        String userOldEntry = "April";
        String userNewEntry = "December";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(userOldEntry))
                list.set(i, userNewEntry);
        }

        for (int j = 0; j < list2.size(); j++)
            assertEquals(list2.get(j), list.get(j));

    }

}