public class Task2 {

	public static void main(String[] args) {
		char c = 97;
		System.out.println(c);
		c++;
		System.out.println(c);
		// różnica wynika z tego że w Javie znaki są przechowywane w postaci kodów ASCII
		// zwiększając wartośc c zamieniamy je z 97 (symbol a) do 98 (symbol b)
		// ASCII - (7-bitowy kod przyporzadkowujący liczby z zakresu 0-127 literom alfabetu angielskiego)
	}
}
