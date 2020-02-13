package com.charter.hello.world.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldResponse {
    String message;

    public HelloWorldResponse(String message){
        this.message = message;
    }

    public HelloWorldResponse(){
        this.message = "Hello World!";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
