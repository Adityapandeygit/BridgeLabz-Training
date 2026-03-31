package Demo.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagertest {

    ListManager listmanager;
    List<Integer> list;

    @BeforeEach   
    void setup() {
        listmanager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listmanager.addElement(list, 10);
        listmanager.addElement(list, 20);

        assertEquals(2, listmanager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);

        listmanager.removeElement(list, 20);

        assertFalse(list.contains(20));
        assertEquals(2, listmanager.getSize(list));
    }

    @Test
    void testGetSize() {
        assertEquals(0, listmanager.getSize(list));

        list.add(1);
        list.add(2);

        assertEquals(2, listmanager.getSize(list));
    }
}
