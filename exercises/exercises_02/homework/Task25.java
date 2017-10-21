public class Task25 {

	public static void main(String[] args) {
		int x = (int)((1000 + 1) * Math.random());
		System.out.println(x);
		boolean b = x % 2 == 0 && x % 5 == 0;
		System.out.println(b);
		boolean c = x % 3 == 0 && x % 7 == 0;
		System.out.println(c);
		if (b || c) {
			System.out.println("Losowanie udane");
		}
	}

}
