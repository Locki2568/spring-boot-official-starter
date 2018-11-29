package com.oocl.web.sampleWebApp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/users")
public class UserController {

    //UserService userService;

//    @Autowired
//    public UserController(UserService userService){
//        this.userService = userService;
//    }

    @PostMapping()
    public ResponseEntity<String> initiateUser(@RequestBody User user){
        int id = user.getId();
        return ResponseEntity.created(URI.create("/users/"+id)).body("Hello World");
    }
}
