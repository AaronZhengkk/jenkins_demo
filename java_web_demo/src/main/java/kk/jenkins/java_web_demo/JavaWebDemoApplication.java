package kk.jenkins.java_web_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebResult;

@SpringBootApplication
@RestController
public class JavaWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebDemoApplication.class, args);
    }


    @RequestMapping("helloWorld")
    public String helloWorld(){
        return "人生苦短， 我用Jenkins";
    }




}
