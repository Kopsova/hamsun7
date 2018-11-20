package com.greenfox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Object doubleNumber (@RequestParam(value = "input", required = false)Integer input) {
        if (input == null) {
            return new Error("Please provide an input!");
        }else {
            return new Double(input);
        }
    }

    @GetMapping("/greeter")
    public Object greeting (@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name == null){
            return new Error("Please provide a name!");
        }
        else if(title == null) {
            return new Error("Please provide a title!");

        } else {
            return new Greeter(name,title);
        }

    }

    @GetMapping("appenda/{appendable}")
    public Object appending (@PathVariable ("appendable") String appendable) {
        return new Appenda(appendable);
    }
}
