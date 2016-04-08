package de.invidit.example.web;

import de.invidit.example.model.ExampleData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Michael Weber
 * @since 08.04.2016
 */
@Controller
public class ExampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value ="/example", method = RequestMethod.POST)
    public String justAPOSTMethod(@RequestBody ExampleData exampleData) {
        System.out.println(exampleData);
        return "index";
    }
}
