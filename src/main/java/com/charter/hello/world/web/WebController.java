package com.charter.hello.world.web;

import com.charter.hello.world.model.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

@RestController
public class WebController {
    private static HelloWorldResponse theMessage = new HelloWorldResponse();

    @GetMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody HelloWorldResponse hello(){
        return theMessage;
    }
    @PostMapping(value = "/hello",
        consumes = {"application/json"},
        produces = {"application/json"})
    @ResponseBody HelloWorldResponse sUp(@RequestBody HelloWorldResponse message){
        if (message == null)
        {
            message = new HelloWorldResponse("Say hello in your POST body.");
        }
        theMessage = message;
        return theMessage;
    }
}
