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

To jest w sumie taki wymapsiony konstruktor:
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

