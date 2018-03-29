Java powstała jako negacja do C++

Java i C# to w zasadzie to samo. Jak nie ma dokumentacji do czegoś w javie to można śmiało czytać dokumentację do C#, trudno je odróżnić, prawie na peno będzie pasowało

Fluent API - żeby metoda zwracała coś tego samego typu co dane wyjściowe. Czyli, żeby metoda operująca na stringach zwracała stringi;
- jeżeli tworząc klasę da się tak zrobić, to warto robić;

Po to są settery i gettery, żeby można było przejąć kontrolę nad zmianą. I uchwycić dokładnie moment zmiany.
Jeśli w konstruktorze na sztywno przypisujemy wartości, to wtedy nie przechodzimy przez settera. Nie ma kontroli nad tym co się dzieje. Może warto by było używać setterów też w konstruktorze?



### Przekazywanie przez wartość vs przez referencję
+ doczytać!

```JAVA
Class ABC
this.a = a   // to powoduje podstawienie wartości przez referencję; zmieniamy wartość podstawowego obiektu;
this a = newA (A) // w tym miejscu main posiada oryginał a klasa ABC posiada kopię, nie odwołują się do tego samego obiektu;
```

Do konstruktora należy przkazywać obiekty utworozne na zewnątrz, a nie tworzyć je w konstruktorze!
**W konstruktorze nie używać new() wbec komponentów!** W konstruktorze nie tworzymy nowej instancji;

**Tak jest dobrze:**
```JAVA
Class Car {

private Wheel wheel;
Car ( Wheel wheel) {
this.wheel = wheel;
}

wheel = new wheel();
Car car = new car (... wheel)
```

**Tak nie robimy:**
```JAVA
Class Car {

private Wheel wheel;
Car ( Wheel wheel) {
this.wheel = new wheel();
}

Car car = new car ()
```

Kontrolę nad komponentami ma mieć program główny, a nie obiekt.
Za cykl życia obiektów odpowiada zewnętrze, obiekt się tylko z nich składa.
To się nazywa **inversion of control**. To jest ważne.


**TAK NIE ROBIMY:**
```Java
int value1 = new value (7);
int value2 = new value (9);
if (value1 == value2) {
    /// coś tam;
}
```
Niczego, co ma w sobie klasę nie porównujemy operatorem "==". To jest porównanie przez referencję. Więc czasem się uda (jeśli w mięczyczasie nie zmieni się adres w heap), ale kiedyś się nie uda.
Obiekty klasy porównujemy przez wartość, metodami equals ((s1.equals(s2)). Metoda equals jest zdefiniowana w Object, więc jest dziedziczona przez wszystkie klasy (czasem być może trzeba będzie zrobić override)

---

`System.out.println`
- System: klasa;
- out: zmienna (obiekt);
- println: metoda;

---
Deklaracja funkcji ze zmiennną liczbą argumentów:
`fun (Integer ... arg)` -> to oznacza od zera do dowlonie zmiennych typów Integer. To jest tłumaczone jako tablica arg Integerów (`[]arg`)

---
Język domenowy - język opisu domeny opisujący to na czym się będzie pracowało;
