package bittencourt.iuri.exemplopredestroyepostconstruc;

import bittencourt.iuri.exemplopredestroyepostconstruc.dao.ClienteDAO;
import bittencourt.iuri.exemplopredestroyepostconstruc.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemplopredestroyepostconstrucApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopredestroyepostconstrucApplication.class, args);

		ClienteDAO clienteDAO = applicationContext.getBean(ClienteDAO.class);


		ClienteDAO.setCliente(new Cliente("Iuri", "Bittencourt"));

		System.out.println("ClientDao: " + clienteDAO);
		System.out.println("Cliente: " + clienteDAO.getCliente().toString());

	}


}
