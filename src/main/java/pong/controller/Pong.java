package pong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import pong.service.CallerService;

public class Pong {
    @Autowired
    private CallerService callerService;


    @GetMapping(value = "/")
    public ResponseEntity<String> getCaller(){
        String caller = this.callerService.getCaller();
        return new ResponseEntity<String>(caller, HttpStatus.OK);
    }
}
}
