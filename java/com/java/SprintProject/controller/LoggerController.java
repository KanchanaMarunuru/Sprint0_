
package com.java.SprintProject.controller;
 
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
 
@RestController

public class LoggerController {

private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LoggerController.class);

@RequestMapping("/")

public String hello() {

    logger.info("This is sample info message");

    logger.warn("This is sample warn message");

    logger.error("This is sample error message");

    logger.debug("This is sample debug message");

    return "Hello Jyothsna";

}

}