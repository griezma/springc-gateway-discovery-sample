package griezma.scgateway.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }

    Logger log = LoggerFactory.getLogger(HelloServiceApp.class);

    @RequestMapping("/hello")
    String hello() {
        log.info("processing hello");
        log.debug("logging hello");
        return "Hello world";
    }

    @RequestMapping("/hello/{name}")
    String helloName(@PathVariable String name) {
        log.info("processing hello/{name} with name={}", name);
        log.debug("logging hello/{name}");
        return "Hello " + name;
    }

}
