import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.add(20);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        assertTrue(queue.isEmpty());
        queue.add(20);
        assertEquals(20, queue.peek());
        queue.add(25);
        assertEquals(20, queue.peek());
    }

    @Test
    public void testAdd() {
        assertTrue(queue.isEmpty());
        queue.add(20);
        queue.add(25);
        assertEquals("20 25 ", queue.toString());
        queue.add(30);
        assertEquals("20 25 30 ", queue.toString());
    }

    @Test
    public void testRemove() {
        assertTrue(queue.isEmpty());
        queue.add(20);
        queue.add(25);
        queue.add(30);
        assertEquals("20 25 30 ", queue.toString());
        queue.remove();
        assertEquals("25 30 ", queue.toString());
        assertEquals(25, queue.remove());
    }


}