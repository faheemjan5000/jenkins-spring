package faheem.jenkins.spring.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/greetings")
public class Greetings {

    @GetMapping("/")
    public String greetings(){
       log.info("inside Greetings.greetings() method of controller ");
        return "Good Morning!";
    }
}
