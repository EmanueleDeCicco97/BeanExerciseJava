package it.emanuele.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.emanuele.Calcolatrice;
import it.emanuele.Operazione;

@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)

public class Config {
	@Bean
    public Operazione getOperazione() {
	Operazione o = new Operazione(0, 0);
	o.setOperazionei();
	return o;
			
    }
}	