package com.oreilly.message;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {

    @RequestMapping(path = "/message", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String message() {
        return new String("I am version 3.");
    }


}
