package it.emanuele;

import java.util.Scanner;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Calcolatrice {
	
	Operazione operazione;
	Scanner s = new Scanner(System.in);
	
	public Calcolatrice(Operazione operazione) {
		
	this.operazione=operazione;
	}
	
	public double Calcolo() {
		
	double addendo1 = operazione.getAddendo1();
	double addendo2 = operazione.getAddendo2();
	String scelta = operazione.getScelta();
	double risultato =0;
			
	
if(scelta.equals("1"))
{
	System.out.println("Hai scelto l'addizione ");
		risultato = addendo1+addendo2;
}	
if(scelta.equals("2"))
{
	System.out.println("Hai scelto la sottrazione ");
		risultato = addendo1-addendo2;
}	
if(scelta.equals("3"))
{
	System.out.println("Hai scelto la moltiplicazione ");
		risultato = addendo1*addendo2;
}
if(scelta.equals("4"))
{
	System.out.println("Hai scelto ");
		risultato = addendo1/addendo2;
}
		return risultato;
	}
}

