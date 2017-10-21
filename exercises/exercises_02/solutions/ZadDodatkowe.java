public class ZadDodatkowe {
  public static void main(String[] args) {
    // wylosujmy zmienną całkowitliczbową typu int z przedziału od -50 do 50
    int x = (int)(100 * Math.random() - 50);
    
    // kontrolnie wypiszmy wylosowaną wartość x
    System.out.println("x = " + x);
    
    // wypiszmy początek naszego komunikatu (jako, że x zawsze będzie należał do jednego lub więcej zbiorów)
    // metoda print w przeciwieństwie do println nie przechodzi od razu do kolejnej linii
    System.out.print("x nalezy do ");
    
    // jeżeli x jest większy równy -5 to należy do zbioru A
    if (x >= -5) {
      System.out.print("A");
    }
    
    // jeżeli x jest mniejszy równy 5 to należy do zbioru B
    if (x <= 5) {
      System.out.print("B");
    }
    
    // jeżeli x jest większy równy -10 i mniejszy równy 10 to należy do zbioru C
    if (x >= -10 && x <= 10) {
      System.out.print("C");
    }
    
    // na koniec przejdźmy do kolejnej linii
    System.out.println();
    
    // alternatywnie można wykorzystać operator trójargumentowy doklejając kolejne zbiory do zmiennej typu String za pomocą operatora dodawania
    String text = "x nalezy do ";
    
    // jeżeli x należy do A to doklejmy literę A, a w przeciwnym przypadku doklejmy zbiór pusty
    text = text + (x >= - 5 ? "A" : "");
    
    // jeżeli x należy do B to doklejmy literę B, a w przeciwnym przypadku doklejmy zbiór pusty
    text = text + (x <= 5 ? "B" : "");
    
    // jeżeli x należy do C to doklejmy literę C, a w przeciwnym przypadku doklejmy zbiór pusty
    text = text + (x >= -10 && x <= 10 ? "C" : "");
    
    // na koniec wypiszmy naszą zmienną typu String na konsoli
    System.out.println(text);
  }
}