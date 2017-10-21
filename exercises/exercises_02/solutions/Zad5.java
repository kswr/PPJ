public class Zad5 {
  public static void main(String[] args) {
    // każdy z typów podstawowych w języku Java ma swoje typy opakowujące
    // zawierające wiele przydatnych metod związanych z obsługą tych typów
    // nazwa typu opakowującego zazwyczaj odpowiada nazwie typu rozpoczętej wielką literą
    // ich metody i stałe są wywoływane przez NazwaTypu.Metoda() i NazwaTypu.Stała
    
    // zmienna typu boolean ma tylko dwie wartości: fałsz i prawdę
    boolean minBoolean = Boolean.FALSE;
    boolean maxBoolean = Boolean.TRUE;
    System.out.println("Min. wartosc boolean = " + minBoolean + ", maks. wartosc boolean = " + maxBoolean + ".");
    
    // dla pozostałych typów zmiennych, zmienne opakowujące zawierają minimalne i maksymalne wartości
    byte minByte = Byte.MIN_VALUE;
    byte maxByte = Byte.MAX_VALUE;
    System.out.println("Min. wartosc byte = " + minByte + ", maks. wartosc byte = " + maxByte + ".");
    
    short minShort = Short.MIN_VALUE;
    short maxShort = Short.MAX_VALUE;
    System.out.println("Min. wartosc short = " + minShort + ", maks. wartosc short = " + maxShort + ".");
    
    int minInt = Integer.MIN_VALUE;
    int maxInt = Integer.MAX_VALUE;
    System.out.println("Min. wartosc int = " + minInt + ", maks. wartosc int = " + maxInt + ".");
    
    long minLong = Long.MIN_VALUE;
    long maxLong = Long.MAX_VALUE;
    System.out.println("Min. wartosc long = " + minLong + ", maks. wartosc long = " + maxLong + ".");
    
    // liczby całkowite przechowywane są w postaci kodów U2
    // w efekcie zmniejszenie najmniejszej dostępnej wartości o jeden da nawiększą dostępną wartość
    // analogicznie zwiększenie o jeden największej dostępnej wartości da najmniejszą możliwą wartość
    System.out.println("Min. wartosc int - 1 = " + (minInt - 1) + ", maks. wartosc int + 1 = " + (maxInt + 1) + ".");
    
    // należy ponadto wspomnieć, że literały całkowitoliczbowe są w języku Java typu int
    // w rezultacie próba bezpośredniego przypisania maksymalnej wartości w postaci liczbowej do zmiennej typu long
    // nie powiedzie się ponieważ przekroczy ona zakres typu int, konieczne jest zaznaczanie typu long poprzez dodanie litery L
    long maxLong2 = 9223372036854775807L;
    
    // wartość kodu U2 można podejrzeć dzięki następującej metodzie
    System.out.println("Kod U2 dla -1 = " + Integer.toBinaryString(-1) + ".");
    
    float minFloat = Float.MIN_VALUE;
    float maxFloat = Float.MAX_VALUE;
    System.out.println("Min. wartosc float = " + minFloat + ", maks. wartosc float = " + maxFloat + ".");
    
    double minDouble = Double.MIN_VALUE;
    double maxDouble = Double.MAX_VALUE;
    System.out.println("Min. wartosc double = " + minDouble + ", maks. wartosc double = " + maxDouble + ".");
    
    // typy zmiennoprzecinkowe również posiadają ograniczoną dokładność
    // z tego powodu np. odjęcie jeden od maksymalnej wartości typu double nie wpływa na jej wartość
    // jedynka nie jest znacząca przy tak dużej wartości, nie zmieściła się w ograniczonej liczbie bitów reprezentujących wartość
    System.out.println("Maks. wartosc double = " + maxDouble + ", maks. wartosc double + 1 = " + (maxDouble + 1) + ".");
    
    char minChar = Character.MIN_VALUE;
    char maxChar = Character.MAX_VALUE;
    System.out.println("Min. wartosc char = " + minChar + ", maks. wartosc char = " + maxChar + ".");
    
    // warto zauważyć, że char jest jedynym typem liczbowym bez znaku
    System.out.println("Min. wartosc char = " + (int)minChar + ", maks. wartosc char = " + (int)maxChar + ",");
  }
}
