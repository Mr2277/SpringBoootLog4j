package com.example.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
@Slf4j
public class LogController {

    @RequestMapping("/test")
    public void test() {
        System.out.println("test");
        log.debug("debug");
        log.error("error");
        log.info("info");

    }
}
