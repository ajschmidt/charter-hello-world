package com.charter.hello.world.web;

import com.charter.hello.world.model.HelloWorldResponse;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class WebController {
    @GetMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody HelloWorldResponse hello(){
        return new HelloWorldResponse("Hello World!");
    }
    @PostMapping(value = "/hello",
        consumes = {"application/json"},
        produces = {"application/json"})
    @ResponseBody HelloWorldResponse sUp(@RequestBody HelloWorldResponse message){
        if (message == null)
        {
            message = new HelloWorldResponse("Say hello in your POST body.");
        }
        return message;
    }
}
