package faheem.jenkins.spring.example.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public boolean isGreaterThanTwo(int input){
        return input>2;
    }
}
