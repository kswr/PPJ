
public
	class Extra_01{
	
	public static void main(String[] args){
		int x = (int)(20*Math.random());
		System.out.println(x);
		if(x > -5){
			System.out.println('A');
		}
		if(x < 5){
			System.out.println('B');
		}
		if(x > -10 && x < 10){
			System.out.println('C');
		}
	}
}
