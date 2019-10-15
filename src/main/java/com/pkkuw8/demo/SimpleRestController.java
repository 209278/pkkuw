package com.pkkuw8.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping(value = "/rev", method = RequestMethod.GET)
    public String rev(@RequestParam(value = "string", defaultValue = "test") String str){
        return new SimpleStringClass(str).rev();
    }

    @RequestMapping(value = "/checkType", method = RequestMethod.GET)
    public String checkType(@RequestParam(value = "string", defaultValue = "test") String str){
        return new SimpleStringClass(str).chackType();
    }
}
