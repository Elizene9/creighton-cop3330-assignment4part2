package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteItemControllerTest {

    @Test
    void ItemDeletedWhenTitleEntered() {

        List<String> list = new ArrayList<>();
        List<String> newList = new ArrayList<>();

        newList.add("January");
        newList.add("February");
        newList.add("April");

        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");

        for (int i = 0; i < list.size(); i++) {

            if ("March".equals(list.get(i)))
                list.remove(i);
        }

        for (int j = 0; j < newList.size(); j++) {

            assertEquals(newList.get(j), list.get(j));
        }
    }


}