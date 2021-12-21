package examples;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("este mensaje saldra por consola");
		short a, b;
		a = 8;
		b = 30;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a+b = " + (a+b));
		
		Scanner entry = new Scanner(System.in);
		System.out.println("introduce tu nombre , por favor");
		String Name = entry.nextLine();
		System.out.println("gracias, muy amable");
		

	}

}
