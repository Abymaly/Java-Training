### Builder Pattern

**Wzorzec kreacyjny do tworzenia obiektów.**
We wzorcu _kompozyt_ można przegiąć robiąc zbyt długie konstruktory. To nie jest dobre.
Wzorzec _builder_ pozwala nam skrócić i uprościć konstrukotry. Ale trzeba koniecnie dawać testy. Bo nic nam nie powie, że czegoś nie ma w kostruktorze.

Tu są koszmarnie długie konstruktory. I każdy trzeba zainicjować i jeszcze zrobić testy jednostkowe. No może bez przegięć?
```JAVA
Person person = new Person("ja", 123);
```

No ale tutaj jest obiekt niezainicjowany. No też nie dobrze.
```JAVA
Person p2 = new Person();
p2.setName("ja");
p2.setPesel(123);
```

To jak ma być? Tak, żeby w danej sytuacji było dobrze.

Więc może tak:
```JAVA
//To nie jest dobze napisane, chodzi o koncepcję
Person p3 = new Person().setName("ja").setPesel(123);
```
W taki sposób nie ma argumentu, że można użyć niezainicjowanego obiektu. To jak to napisać?

To można zrobić taki setter (prawie jak getter):
```JAVA
Person setName (name) {
    this.name = name;
    return this;
```

Wtedy trzeba jeszcze zrobić konstruktor bezparametrowy:
```JAVA
    public Person () {}
```

No i dodać:
```JAVA
    public static Person getPerson () {
        Person p1 = new Person();
        return p1;
    }
```

To jest w sumie taki wypasiony konstruktor:
```JAVA

public class FatMan {
    FatMan = getFatMan()
        .getPerson()
            .setName()          // -> to musi zwrócić typ Person
            .setPesel()         // -> to musi zwrócić typ Person
            .and()              // -> to musi zwrócić typ FatMan
        .getStudent()
            .setFaculty()       // -> to musi zwrócić typ Student
            .and()              // -> to musi zwrócić typ FatMan
        .dalej
}
```

---

### Wzorzec obserwator (_observer_)

Wzorzec czynnościowy.

Do powiadamiania obiektów zainteresowanych informacją o zmianie stanu innego obiektu.

- jeden obiekt obserwowany (_observable, subject_) -> model;
- dowolnie wiele obserwatorów (_observer, listener_) -> widok;

Obserwator informuje obserwującego, że dane się zmieniły, więc obserwowany ma podjąć jakąś reakcję.
Obserwujący nie powinien wiedzieć ani wnikać kto go obserwuje.

Tworzymy widok i model. Widok mówi modelowi: dopisz mnie do subskrybenta operacji.

Systemy przetwarzające informacje:
- stanowe;
- bezstanowe;

Wersja stanowa:
- przesyłamy informację tylko o zmianie;
- w pamięci musi być przechowywany poprzedni stan, który teraz zmodyfikuje;
- jeśli coś pójdzie nie tak z pamięcią, to się wysypie;
- od tego się odchodzi, chociaż czasem jest potrzebne;

Wersja bezstanowa:
- klient nie przechowuje stanu w pamięci;
- razem ze zmianą przekazywany jest cały zestaw danych do wyświetlenia;
- przekazujemy wszystko do widoku, za każdym razem tworzymy nową instancję;
- alternatywnie wysyłamy to na zewnętrzny serwer (obojętne na który, możemy mieć ich farmę);
- za każdym razem przesyłamy do któregoś z serwerów całą informację, od tworzy widok mając pełen zestaw danych;
- zawsze wyświetli dobrze;

Wada:
- w standardowym wdrażaniu obserwator (widok) nie wie o innych obserwatorach;
- można przesadzić z ilością wysyłanych informacji;

Model rozszerza Observer:
`public class Board extends Observable`

Model w miejscu gdzie zmienia .setData() musi informować, że się zmienił i wysyłać informację do widoku:
```JAVA
setChanged();       // ifnormacja, że się zmieniłem
notifyObservers();  // wysłanie informacji do widoku
```

Widok implementuje Oserver:
`public class ShowBoard implements Observer {`

Widok ma metodę:

```JAVA
@Override
public void update(Observable observable /* kto przysłał */, Object o /* co przysłał */) {
    if (!(observable instanceof Board)) {   // to jest zabezpieczenie przed tym czy od dobregu modelu przychodzą informacje
        return;
    }
    Board board = (Board) observable;   // to jest cast (rzut); wiemy, że observable tak naprawdę jest board
    show(board);                        // model wysyła informację, że coś się zmieniło, widok pobiera wszystkie dane i rysuje od nowa
}
```

## Wzorzec mediator (_mediator pattern_)

Wzorzec czynnościowy, modyfikacja obserwatora.

Umożliwia zmniejszenie liczby pwoiązań między klasami.

W zasadzie jak obserwator, ale wtedy kiedy zachodzi przekaz zbyt wielu informacji.

Model wysyła zbyt dużo informacji od widoku, który chciałby to zebrać w informację zbiorczą. Przekazywana jest informacja zgeneralizowana ("zmieniła się dolna lewa część planszy", zamiast "zmieniła się cała plansza").

Nie ściągamy paczek updetów pojedynczo tylko tworzymy paczkę zbiorczą z informacją o sensie zmiany.

Między obserwatorem i obiektem obserwowanym jest mediator protokołu.

Mediator potrafi zbierać informacje.

---

### Wytwórnie projektowe

Wytwórnie są prostopadłę do builderów
Buildery służądo tworzenia jednego obiektu o różnych atrybutach.
Wytwórnie są stargetowane na projektowanie różnych bytów.

```JAVA
class Base;
class B1 extends Base;
class B2 extends Base;

// Base obj = new B1 /* albo, w zależności od jakiegoś parametru */ Base obj = new B2
// Czyli można zrobić obiekt:

Base create (String what) {
if (what.equals ("B1") {
    return new B1();
    } else if (what.equals ("B2") {
    return new B2();
}
```
Metoda create jest typu Base. Możemy tak zrobić bo B1 i B2 dziedziczą po Base. Czy obiekt może zostać utworzony.

---

### Maszyna stanów skończonych (_Finite State Machine_)

Maszyna stanów skończonych - abstrakcyjny, matematyczny, iteracyjny model zachowania systemu dynamicznego, oparty na tablicy przejścia między stanami;

Maszyna stanowa - są stany i zdefiniowane przejścia między konkretnymi stanami;

Implementacja:
- enum stanów (jakie sąstany) - definicja węzłów grafów;
- tablica przejść (jakie są akcje i jakie są skutki) - definicja krawędzi grafów; tablica dwuwymiarowa;



_Maszyna Turinga_ - coś co potrafi liczyć i w trakcie liczenia podejmować decyzję na podstawie tego co policzyło. Nie jest maszyną stanów skończonych