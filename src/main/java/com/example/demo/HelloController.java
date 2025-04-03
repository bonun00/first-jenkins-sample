package com.example.demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")

public class HelloController {
    @GetMapping
    public String sayHello() {
        System.out.println("hello!!");
        return "알인러마이너리ㅏㅁ너이라ㅓㅣㄴ러ㅣ머ㅣㅏ러ㅏㅁ언!";
    }
}