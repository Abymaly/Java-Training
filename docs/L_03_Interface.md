### interface

Interface - zestaw metod bez ich implementacji (bez ciała).
Właściwa implementacja metod zawartych w interfejsie znajduje się w klasie implementującej dany interfejs.


```JAVA
Class Person
interface IPerson {
    abstract String getName();
    abstract long getPesel();
    abstract void setName(String name);
    abstract void setPesel(long pesel);
}

Class Person implements IPerson
```
Można stworzyć zmienną typu interface

IPerson ip = new Person (...)

Osobny interface dla każdej klasy


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
