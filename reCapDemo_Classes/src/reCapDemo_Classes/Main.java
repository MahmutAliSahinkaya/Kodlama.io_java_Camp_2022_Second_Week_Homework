package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();

		int result = fourOperations.Sum(3, 4);
		System.out.println(result);
		int result2 = fourOperations.Subtract(3, 4);
		System.out.println(result2);
		int result3 = fourOperations.Multiplication(3, 4);
		System.out.println(result3);
		double result4 = fourOperations.Division(3, 4);
		System.out.println(result4);

	}

}
