package com.eprogrammerz.examples.spring.springbootjsp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/next/{last}/{secondLast}")
    public int index(@PathVariable("last") int last, @PathVariable("secondLast") int secondLast) throws Exception {
        return last + secondLast;
    }
}
