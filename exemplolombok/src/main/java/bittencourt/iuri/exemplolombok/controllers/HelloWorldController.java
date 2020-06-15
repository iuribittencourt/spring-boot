package bittencourt.iuri.exemplolombok.controllers;

import bittencourt.iuri.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo Lombok";
    }

    @GetMapping("/client")
    public String getClient() {

        //base de dados... banco de dados.
        Client client = new Client();
        client.setName("Thiago");
        client.setLastName("cury");
        client.setAge(36);

        return client.toString();

    }

    @GetMapping("/product")
    public String getProduct() {
        return "objeto produto";
    }
}
