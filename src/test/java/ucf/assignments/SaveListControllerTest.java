package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SaveListControllerTest {

    @Test
    void filesAreReadProperly() throws FileNotFoundException {

        Scanner writer = new Scanner (new File("Testing.txt"));

        String[] first = new String[3];

        for (int i = 0; i < 3; i++)
            first[i] = writer.next();

        assertEquals("January", first[0]);
        assertEquals("February", first[1]);
        assertEquals("March", first[2]);
    }
}