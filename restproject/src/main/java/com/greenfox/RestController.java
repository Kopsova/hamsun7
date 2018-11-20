package com.greenfox;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("dountil/{action}")
    public Object doUntil (@PathVariable ("action") String action, @RequestBody DoUntilNumber numb) {
        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 0; i <= numb.getUntil(); i++) {
                sum += i;
            }
            return new DoUntil(sum);
        }
        if (action.equals("factor")) {
            int fact = 1;
            for (int i = 1; i <= numb.getUntil() ; i++) {
                fact*= i;
            }
            return new DoUntil(fact);
        }
        return new DoUntil();

    }
}
