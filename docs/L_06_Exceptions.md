### Wyjątki
Wyjątki: coś się spieprzyło, nie działa, nie wiem co z tym zrobić, niech się ktoś tym zajmie.

**Takie bardzo silne go to z przekazaniem parametru i zamknięciem wszystkich klamer. Wielokrotny return**

Wyjątki są w każdym współczesnym języku

Zasady:
- nie programować na wyjątkach!; obsługa wyjątków jest kosztowna (pod względem pamięci i czasu); wyjątki są od rozwiązywania sytuacji wyjątkowych nie obsługiwać flow programu wyjątkami;
- tam gdzie potrzeba, to używać - nie próbować obchodzić na siłę;
- wyjątki pojawiają się wtedy, kiedy dane które trzeba obsłużyć nie pasują do wzorca;

Obsługa wyjątków nie powinna zajmować dodatkowych zasobów:
- wyjątki rzucane są w sytuacji kiedy coś nie działa;
- jeśli wyjątek rzucamy bo brakuje pamięci to nie używajmy więcej pamięci do obsługi wyjątku;

Czynności ryzykowne:
- nie sprawdzać przed czynnością czy się da i jeśli się nie da to rzucić wyjątek, tylko wykonać i jeśli się nie powiodło to wtedy rzucić wyjątek;
    - aplikacja ma dzielić dwie liczby: nie sprawdzać czy user wprowadził dzielenie przez zero i jeśli tak to rzucić wyjątek tylko podzielić wprowadzone liczby i jeśli jest błąd to wtedy rzucić wyjątek;
    - aplikacja ma zapisywać plik: nie sprawdzać czy jest już plik o takiej nazwie i jeśli jest to rzucić wyjątek, tylko zapisać plik i jeśli jest błąd to rzucić wyjątek;

Do zapamiętania, do implementacji, nigdy nie używać inaczej: **try, catch, throw** – spróbuj, rzuć i złap;

```JAVA
fun … () {
try {
	…throw new Exception();
}
catch ( ) {
…
}
}
```

Kolejność pułapek jest istotna. Łapie się catch który pasuje typem do throw, ale to który z pasujących catch się złapie zależy od kolejności ich zadeklarowania;


```JAVA
fun … () {
try {
	…throw new Exception (Exc1);
}
catch (Exc2) {  //ten catch nie złapie poprzedniego throw
…
}
}
```

Wyjątki są obiektami. Więc wyjątki mogą dziedziczyć.
`Exc 11 extends Exc1`

Rzucane wyjątki potomne (try) są obsługiwane też przez pułapki (catch) na tatusia. Kolejność jest ważna!

Od miejsca zgłoszenia do miejsca wykonania wyjątku (czyli od throw do catch) nie wykonuję się nic!

```java
class Person ... {
int setPesel () {
if (pesel <0) {
    throw new ArgException();
    }
    this.pesel = pesel;
}

    Person (int pesel) {
        setPesel(pesel);
    }
}
}
```
