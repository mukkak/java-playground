package mukkak.algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Greeting {
    public String hello(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is blank");
        } else {
            log.debug("Saying hello to {}", name);
            return String.format("Hello, %s", name);
        }
    }
}
