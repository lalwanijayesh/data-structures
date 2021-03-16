import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList list;

    @Before
    public void setUp() {
        list = new LinkedList();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.append(3);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() {
        assertTrue(list.isEmpty());
        assertFalse(list.contains(2));
        list.append(2);
        assertTrue(list.contains(2));
    }

    @Test
    public void testAppend() {
        assertTrue(list.isEmpty());
        list.append(2);
        list.append(3);
        assertFalse(list.isEmpty());
        assertEquals("2 3 ", list.toString());
        list.append(5);
        assertEquals("2 3 5 ", list.toString());
    }

    @Test
    public void testPrepend() {
        assertTrue(list.isEmpty());
        list.prepend(2);
        list.prepend(3);
        assertFalse(list.isEmpty());
        assertEquals("3 2 ", list.toString());
        list.prepend(5);
        assertEquals("5 3 2 ", list.toString());
    }

    @Test
    public void testDeleteByValue() {
        list.append(2);
        list.append(3);
        list.append(5);
        list.append(7);
        assertEquals("2 3 5 7 ", list.toString());
        list.deleteByValue(3);
        assertEquals("2 5 7 ", list.toString());
        list.deleteByValue(2);
        assertEquals("5 7 ", list.toString());
    }
}