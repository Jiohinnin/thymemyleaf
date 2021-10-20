package com.example.thymemyleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("example1")
    public String getShit(){
        return "przykład1";
    }
}
