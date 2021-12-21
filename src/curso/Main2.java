package curso;

public class Main2 {

	public static void main(String[] args) {
		
		int number = 3;
		Poly polinomio1 = new Poly();
		number = polinomio1.devuelve3(); 
		
		Poly polinomio3 = new Poly();
		polinomio3 = polinomio1;
		new Poly();
		int number2 = polinomio3.devuelve3();
		System.out.println(number2);
		System.out.println(polinomio1);
		System.out.println(polinomio3);
	}
	
	

}
