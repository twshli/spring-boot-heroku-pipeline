package pipeline.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shli on 04/09/2017.
 */
@RestController
public class HelloController {

    private static final String HELLO_WORLD = "Hello world!";
    private static final String HELLO_PERSON = "Hello, %s!";

    @RequestMapping("/")
    public String greeting() {
        return HELLO_WORLD;
    }

    @RequestMapping("/{name}")
    public String greeting(@PathVariable("name") String name) {
        return String.format(HELLO_PERSON, name);
    }
}
