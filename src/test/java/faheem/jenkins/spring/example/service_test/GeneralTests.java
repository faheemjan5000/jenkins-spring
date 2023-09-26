package faheem.jenkins.spring.example.service_test;

import faheem.jenkins.spring.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class GeneralTests {

    @Autowired
    TestService testService;


    @Test
    public void should_return_true(){
        log.info("inside should_return_true test");
        int input =3;
        boolean actual = testService.isGreaterThanTwo(input);
        boolean expected = true;
        assertEquals(actual,expected);

    }

    @Test
    public void should_return_false(){
        log.info("inside should_return_false test");
        int input =1;
        boolean actual = testService.isGreaterThanTwo(input);
        boolean expected = false;
        assertEquals(actual,expected);
    }
}
