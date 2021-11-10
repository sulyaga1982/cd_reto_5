//1. Modelo o Entidad
//2. Interface
//3. Repositorio
//4. Servicio
//5. Controlador o Web

package Reto_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto_5.Modelo"})
public class Reto5Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto5Application.class, args);
	}

}
