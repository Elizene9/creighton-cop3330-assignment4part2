package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteListControllerTest {

    @Test
    void ListClearsProperlyAndShouldBeEqualToEmptyList() {

        List<String> list = new ArrayList<>();
        List<String> newList = new ArrayList<>();

        list.add("January");
        list.add("February");
        list.add("March");

        list.clear();

        for (int j = 0; j < list.size(); j++)
            assertEquals(newList.get(j), list.get(j));

    }
}