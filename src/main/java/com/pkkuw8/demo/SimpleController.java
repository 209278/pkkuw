package com.pkkuw8.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/rev")
    public String rev(@RequestParam(value = "string", defaultValue = "test") String str){
        return new SimpleClass(str).rev();
    }
}
