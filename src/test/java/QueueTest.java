import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void init() {
        queue = new Queue();
    }

    @Test
    public void isEmpty_noArgs_returnsTrue() throws Exception {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void add_correctlyAddsToStack() throws Exception {
        queue.add(1);
        assertEquals(1, queue.head.data);
        queue.add(2);
        assertEquals(2, queue.tail.data);
        assertEquals(1, queue.head.data);
    }

    @Test
    public void remove_correctlyRemovesFromFront() throws Exception {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(queue.head, queue.remove());
        assertEquals(queue.head.data, 2);
    }

    @Test
    public void peek_returnsFirstNodeInStack() throws Exception {
        queue.add(1);
        queue.add(2);
        assertEquals(1, queue.peak().data);
        assertEquals(1, queue.head.data);
    }
}
