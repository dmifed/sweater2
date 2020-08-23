package com.dmifed.sweater;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by DIMA, on 07.08.2020
 */
// Identify class as Controller
@Controller
public class GreetingController {
    // Controller is a program module which listening request at specific path ("/greeting") and response data.
    // Now it should be response a template file
    @GetMapping("/greeting") //This annotation ensures that http get requests to "/greeting"  are mapped in method greeting
    // RequestParam binds the value of the query parameter name into the name parameter of method
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model){
        model.put("name", name);
        return "greeting"; // Name of View. A View is responsible for rendering the HTML content. File name (greeting) that we want to display.
    }

    @GetMapping
    public String root(Map<String, Object> model){
        model.put("info", "Hi");
        return "main";
    }
}
