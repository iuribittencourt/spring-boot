package bittencourt.iuri.exemplohelloworldrestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Iuri Bittencourt
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá! Hello World com rest repositories";
    }
}
