public class Task1 {

	public static void main(String[] args) {
		int wrt = (int)((100 + 1) * Math.random());
		String a = (wrt >= 0) ? "należy" : "nie należy";
		String b = (wrt <= 1) ? "należy" : "nie należy";
		String c = (wrt >= 0 && wrt <= 1) ? "należy" : "nie należy";
		System.out.println(wrt);
		System.out.println("Zmienna "+a+" do zbioru A, "+b+" do zbioru B i "+c+" do zbioru C");
	}

}
