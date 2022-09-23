package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();

		int result = fourOperations.sum(3, 4);
		System.out.println(result);
		int result2 = fourOperations.subtract(3, 4);
		System.out.println(result2);
		int result3 = fourOperations.multiplication(3, 4);
		System.out.println(result3);
		double result4 = fourOperations.division(3, 4);
		System.out.println(result4);

	}

}
