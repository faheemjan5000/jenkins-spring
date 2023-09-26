package faheem.jenkins.spring.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class Greetings {

    @GetMapping("/")
    public String greetings(){
        return "Good Morning!";
    }
}
