public class Zad4 {
  public static void main(String[] args) {
    // deklaracja zmiennej zawiera jej typ i nazwę
    // zmienna logiczna (prawda lub fałsz)
    boolean b;
    
    // próba użycia niezainicjalizowanej zmiennej zakończy się błędem np.
    // System.out.println(b);
    
    // inicjalizacja zmiennej przypisuje jej wartość początkową
    b = true;
    
    // sprawdźmy uzyskany efekt
    System.out.println(b);
    
    // inną możliwą wartością dla zmiennej logicznej jest fałsz
    b = false;
    System.out.println(b);
    
    // rezultat porównania jest także wartością logiczną
    b = 2 > 4;
    System.out.println(b);
    
    // typy całkowitoliczbowe to byte (8-bitowy), short (16-bitowy), int (32-bitowy) i long (64-bitowy)
    // zadeklarujmy odpowiednie zmienne
    byte i0;
    short i1;
    int i2;
    long i3;
    
    // zainicjalizujmy ich wartości
    i0 = 10;
    i1 = 20;
    i2 = 30;
    i3 = 40;
    
    // sprawdźmy uzyskany efekt
    // suma wartości typu String i zmiennych podstawowych w rezultacie da wartość typu String
    System.out.println("Zmienna typu byte = " + i0 + ", typu short = " + i1 +
                        ", typu int = " + i2 + ", typu long = " + i3 + ".");
                        
    // w kodzie programu wszystkie liczby całkowite mają typ int
    // sygnalizacja dla typu long odbywa się poprzez dodanie l na końcu
    // przez to np. podana linia kodu nie zostanie skompilowana bez rzutowania
    // i2 = 10l;
    // Java nie sprawia natomiast problemu przy zmianie typu na typ o większej liczbie bitów (precyzji),
    // co widać przy inicjalizacji zmiennej typu long
    
    // typy całkowitoliczbowe to float (32-bitowy) i double (64-bitowy)
    // zadeklarujmy odpowiednie zmienne
    float r0;
    double r1;
    
    // zainicjalizujmy ich wartości
    // w kodzie programu wszystkie liczby zmiennoprzecinkowe mają typ double
    // w efekcie należy zasygnalizować fakt, iż zmienna powinna być typu float literą f lub wykonać rzutowanie
    r0 = 10.0f;     // wartość typu float
    r0 = (float)10.0;     // rzutowanie
    r1 = 20.0;
    
    // sprawdźmy uzyskany efekt
    // suma wartości typu String i zmiennych podstawowych w rezultacie da wartość typu String
    System.out.println("Zmienna typu float = " + r0 + ", typu double = " + r1 + ".");
    
    // typ znakowy to char (16-bitowy)
    char c;
    
    // tak naprawdę jest to 16-bitowa liczba bez znaku, która w momencie wypisywania zostaje zamieniona na literę
    // wartość liczby to wartość kodu Unicode litery (początkowy podzbiór tych kodów tworzą tzw. kody ASCII)
    c = 100;
    System.out.println(c);
    
    // same znaki należy umieścić w pojedynczym cudzysłowiu
    c = 'x';
    System.out.println(c);
    
    // kody Unicode wykraczają jednak poza zbiór ASCII
    c = 379;
    System.out.println(c);
  }
}
