import com.tit.week04.day05.junit.list_operations.ListManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListManagerTest{
    //Attribute
    private static ListManager listManager;
    private static List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }
    //test for addElement unit
    @Test
    void testAddElement(){
        listManager.addElement(list, 66);
        listManager.addElement(list, 99);
        assertTrue(list.contains(99));
    }
    //test for removeElement unit
    @Test
    void testRemoveElement(){
        listManager.addElement(list, 99);
        assertTrue(listManager.removeElement(list,99));
    }
    //test for removeElement unit
    @Test
    void testGetSize(){
        listManager.addElement(list,10);
        assertEquals(1,listManager.getSize(list));
    }
}
