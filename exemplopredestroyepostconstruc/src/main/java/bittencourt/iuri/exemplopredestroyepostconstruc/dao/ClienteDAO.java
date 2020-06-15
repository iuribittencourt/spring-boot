package bittencourt.iuri.exemplopredestroyepostconstruc.dao;


import bittencourt.iuri.exemplopredestroyepostconstruc.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@ToString
//lombok
@Getter @Setter
//springboot
@Component
public class ClienteDAO {

    @Autowired
    private Cliente cliente;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado");
    }


}
