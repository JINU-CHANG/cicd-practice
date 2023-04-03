package com.example.cicdpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/sample")
    public String sample(){
        //test "한번더 ?"
        return "Sample!";
    }
}
