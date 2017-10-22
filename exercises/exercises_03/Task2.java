public class Task2 {

	public static void main(String[] args) {
		int wrt = (int)((10 + 1) * Math.random() - 10);
		System.out.println(wrt);
		System.out.println((wrt >= -4 & wrt < -3) ? "Wrt należy do części wspólnej" : "Wrt nie należy do części wspólnej");
	}

}
