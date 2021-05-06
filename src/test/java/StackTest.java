import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    public void isEmpty_returnsTrueWhenEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void push_correctlyAddsToQueue() {
        stack.push(1);
        assertEquals(1, stack.top.data);
        stack.push(2);
        assertEquals(2, stack.top.data);
    }

    @Test
    public void pop_returnsFirstNode() {
        stack.push(1);
        Stack.Node expected = stack.top;

        assertEquals(expected, stack.pop());
        assertNull(stack.top);
    }

    @Test
    public void peak_returnsFirstNode() {
        stack.push(5);
        Stack.Node expected = stack.top;
        assertEquals(expected, stack.peak());
    }

}
