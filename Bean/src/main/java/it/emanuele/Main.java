package it.emanuele;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import it.emanuele.Config.Config;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Calcolatrice calcolatrice = context.getBean(Calcolatrice.class);
		
		System.out.println(calcolatrice.Calcolo());
	}
}