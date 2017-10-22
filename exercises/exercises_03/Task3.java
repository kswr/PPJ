public class Task3 {

	public static void main(String[] args) {
		int dzem = (int)((4 + 1) * Math.random());
		String sloik;
		switch (dzem) {
			case 1: sloik = "truskawkowy";
			      break;
			case 2: sloik = "malinowy";
				break;
			case 3: sloik = "brzoskwiniowy";
				break;
			case 4: sloik = "agrestowy";
				break;	
			default: sloik = "pomarańczowy";
		}
		System.out.println("Słoik zawiera dżem "+sloik);
	}

}
