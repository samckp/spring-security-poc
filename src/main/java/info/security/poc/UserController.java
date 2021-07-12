package info.security.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser(){

        return "greeting from rest api !!";
    }
}
