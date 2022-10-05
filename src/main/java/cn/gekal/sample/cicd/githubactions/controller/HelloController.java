package cn.gekal.sample.cicd.githubactions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    /** LOGGER */
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String say() {

        LOGGER.info("Hello World!!!");

        if (false) {
            LOGGER.warn("never run.");
        } else {
            LOGGER.warn("always run.");
        }


        return "Hello World!!!";
    }

}
