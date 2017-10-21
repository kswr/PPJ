public class Zad7 {
  public static void main(String[] args) {
    // operator mnożenia ma wyższy priorytet w języku Java niż operatory dodawania i odejmowania
    // najpierw zatem wykonywane jest mnożenie, później dodawanie i odejmowanie
    // operatory dodawania i odejmowania mają ten sam priorytet, czyli są wykonywane od lewej do prawej
    int x = 2 * 5 + 3 * 4 - 8;
    
    // w efekcie otrzymujemy wartość 14
    System.out.println(x);
    
    // spróbujmy zmienić kolejność wykonywania operacji poprzez dodanie nawiasóœ
    x = 2 * (5 + 3) * 4 - 8;
    
    // w efekcie otrzymujemy wartość 56, o 8 za dużo
    System.out.println(x);
    
    // zwiększmy zatem odejmowaną wartość
    x = 2 * (5 + 3) * 4 - 8 * 2;
    
    // w efekcie otrzymujemy pożadaną wartość 48
    System.out.println(x);
    
    // warto nadmienić, że w języku Java jednak nie wszystkie operatory wykonywane są od lewej do prawej
    // np. operator = wykonywany jest od prawej do lewej
    int y = 2;
    x = y = 5;
    
    // w efekcie najpierw zmienna y przyjmuje wartość 5, po czym zmienna x przyjmuje wartość y, czyli też 5
    System.out.println("x = " + x + ".");
    System.out.println("y = " + y + ".");
  }
}
