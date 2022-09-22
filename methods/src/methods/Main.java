package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
		findNumber();
		findNumber();
		findNumber();

	}

	public static void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int value = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == value) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			sendMessage("Number is available: " + value);
		} else {
			sendMessage("Number is not available: " + value);

		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);

	}

}
