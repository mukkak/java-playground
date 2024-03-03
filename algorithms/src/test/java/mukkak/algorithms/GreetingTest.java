package mukkak.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    private static final Greeting greeting = new Greeting();

    @Test
    public void testHello() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           greeting.hello(null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeting.hello("");
        });

        Assertions.assertEquals("Hello, World", greeting.hello("World"));
    }
}
