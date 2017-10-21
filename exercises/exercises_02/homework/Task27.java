public class Task27 {

	public static void main(String[] args) {
		int x = (int)((1000 + 1) * Math.random()) -500;
		// System.out.println(x);
		int y = (int)((1000 + 1) * Math.random()) -500;
		if (x < 0 && y < 0) {
			x = 1;
			y = 0;
		}
		System.out.println(x);
		System.out.println(y);

	}

}
