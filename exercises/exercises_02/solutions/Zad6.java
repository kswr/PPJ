public class Zad6 {
  public static void main(String[] args) {
        
        // w Javie następuje promocja argumentów dla operatorów dwuargumentowych, zgodnie z następującą zasadą:
        // jeżeli jeden z argumentów jest typu double, drugi przekształcany jest do typu double 
        // w przeciwnym razie, jeżeli jeden z argumentów jest typu float, drugi przekształcany jest do typu float 
        // w przeciwnym razie, jeżeli jeden z argumentów jest typu long, drigi przekształcany jest do typu long 
        // w przeciwnym razie oba argumenty przekształcane są do typu int
        
        int i = 10;
        char c = 'a';
        
        // w efekcie suma zmiennych typu int i char będzie typu int
        int j = i + c;
        System.out.println(j);
        
        // natomiast przypisanie do zmiennej typu char wymaga rzutowania
        char d = (char)(i + c);
        System.out.println(d);
        
        // przez wymienioną zasadę w takim wypadku rzutowania wymaga nawet suma dwóch zmiennych typu char
        char e = (char)(c + d);
        System.out.println(e);
        
        // kolejność zmiennych przy operacji dodawania nie ma natomiast znaczenia w wymienionych przypadkach
        j = c + i;
        System.out.println(j);
        d = (char)(c + i);
        System.out.println(d);
        
        // analogicznie suma zmiennych typu float i double będzie typu double
        double x = 10.0;
        float y = 20.0f;
        double w = x + y;
        System.out.println(w);
        float z = (float)(x + y);
        System.out.println(z);
        
        // i znowu zgodnie ze wspomnianą zasadą suma zmiennych typu byte i int będzie typu int
        byte a = 5;
        j = i + a;
        System.out.println(j);
        byte b = (byte)(i + a);
        System.out.println(b);
	}
}
