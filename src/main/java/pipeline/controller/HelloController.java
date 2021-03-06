package pipeline.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shli on 04/09/2017.
 */
@RestController
public class HelloController {

    private static final String HELLO_WORLD = "Hello world!";
    private static final String HELLO_PERSON = "Hello, %s!";

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return HELLO_WORLD;
    }

    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public String greeting(@PathVariable("name") String name) {
        return String.format(HELLO_PERSON, name);
    }
}
