import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(20);
        stack.push(25);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        assertTrue(stack.isEmpty());
        stack.push(20);
        assertEquals(20, stack.peek());
        stack.push(25);
        assertEquals(25, stack.peek());
    }

    @Test
    public void testPush() {
        assertTrue(stack.isEmpty());
        stack.push(20);
        stack.push(25);
        assertEquals("25 20 ", stack.toString());
        stack.push(30);
        assertEquals("30 25 20 ", stack.toString());
    }

    @Test
    public void testPop() {
        assertTrue(stack.isEmpty());
        stack.push(20);
        stack.push(25);
        stack.push(30);
        assertEquals("30 25 20 ", stack.toString());
        stack.pop();
        assertEquals("25 20 ", stack.toString());
        assertEquals(25, stack.pop());
    }




}