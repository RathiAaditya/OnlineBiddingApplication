package com.biddingportal.onlinebidding;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineBiddingController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
