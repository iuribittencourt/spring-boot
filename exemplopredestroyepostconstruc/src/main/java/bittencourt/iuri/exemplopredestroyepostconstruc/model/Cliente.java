package bittencourt.iuri.exemplopredestroyepostconstruc.model;

/**
 * @author Iuri Bittencourt
 */

import lombok.*;
import org.springframework.stereotype.Component;

//lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//spring
@Component
public class Cliente {

    private String nome;
    private String lastName;

    public Cliente() {
        System.out.println("Classe cliente!");
    }
}
