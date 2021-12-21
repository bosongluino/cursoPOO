package examples;
import java.util.*;

public class Areas {

	public static void main(String[] args) {
		
		System.out.println("introduce tu edad, por favor");
		Scanner entry = new Scanner (System.in);
		int edad = entry.nextInt();
		
		if(edad<=18) { 
		System.out.println("eres adolescente");
		}
		if(edad<25) {
		System.out.println("ingeniero");	
		}
		if(edad<30) {
		System.out.println("medico");	
		}
		if(edad<40) {
		System.out.println("abogado");
		}
		if(edad<50) {
		System.out.println("psicologo");	
		}
	}

}

