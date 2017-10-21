public class Task24 {

	public static void main(String[] args) {
		int x = (int)((100 + 1) * Math.random());
		System.out.println(x);
		if (x % 2 == 0 ) {
			System.out.println("Liczba jest parzysta");
		}
		if (x % 3 == 0) {
			System.out.println("Liczba jest podzielna przez 3");
		}
		if (x % 5 == 0) {
			System.out.println("Liczba jest podzielna przez 5");
		}
	}

}
