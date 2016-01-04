package pl.michallula.test_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


@Controller
@SpringBootApplication
public class TestProjectApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Rafal!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
    }
}
