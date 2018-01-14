## Wzorce projektowe
#### Dobre praktyki i wymagania niefunkcjonalne

>"Mogę narysować ludzika. Ma głowę, rączki, nóżki i co tam potrzeba. Ale tam pod spodem zabrakło magicznego: _jak się to kurwa rysuje?!_"

Wymagania niefunkcjonalnie:
+ szybko;
+ stabilnie;
+ user experience;
+ bezpiecznie;
+ itd;

Dołożenie każdego wymagania niefunkcjonalnego sprawia, że łatwiej jest napisać cały kod od nowa, zamiast zmieniać już istniejący.
Zaczynamy od wymagań niefunkcjonanych.

Dopiero połączenie wymagań funkcjonalnych z niefunkcjonalmymi daje przyzwoity kod:
+ _architecture_ -> wynika z niefunkcjonalnych; to najpierw;
+ _implementation_ (code) -> wynika z funkcjonalnych; a to dopiero potem;
+ najpierw co napisać, dopiero potem jak!

Przetwrzanie step-by-step vs przetwarzanie równoległe;

---
### Wzorce projektowe
W zasadzie nie występują nigdzie oprócz informatyki.
Ktoś kiedyś wymyślił, że są zasady których warto trzymać się w określonych sytuacjach.

Wzorce projektowe - jak coś robić, co się zyska, a co się straci.
Uwaga - są też **antywzorce**. Wyglądają dokładnie tak samo jak wzorce, ale gdzieś mają informację, żeby nie używać.

Ogarnij wymagania niefunkcjonalne, potem wybieraj wzorzec który do nich pasuje i leć z kodem.
Ale od wzorców można trochę odchodzić.

---

**Wzorce**
+ strukturalne;
+ kreacjonistyczne;
+ zachowawcze (behawioralne);

**Kompozyt** - wzorczec strukturalny, czyli mówiący jak ma wyglądać organizacja klas i obiektów; sprawia, że kontruktor obiektów robić się bardzo długi i złożony;
Jest to sprzeczne z koncepcją, że funkcja nie powinna mieć więcej niż 3 argumenty (no, może czasem przejdą 4). Inaczej testowalność idzie się gonić.
Jeśli kommpozycja przerasta zdrowy rozsądek, to należy należy zdekomponować kompozycję do podkompyzji i skomponować od nowa.


## Unit test
Testowanie poszczególnych jednostek w programie: klas i metod;
Nie wzystkie narzędzia napisane jak unit testy są testami jednostkowymi.
Jednocześnie z pisaniem programu, dobrze jest dorabiać do niego proste, nudne testy. Jeśli się tego nie zrobi od razu, to potem nigdy nie będzie na to czasu.

Dla każdego testu tworzymy nowy obiekt.

Pokrycie kodu testami mierzy się w dwóch kategoriach:
+ pokrycie linii -> line coverage;
+ pokrycie rozgałęzień(if i cała reszta) -> branch coverage;

Dobrze przyjętą praktyką jest pokrycie 80%.
Absolutne minimum to 60%.
W niektórych rozwiązaniach (telekomunikacja, systemy ratujące życie, itp.) musi być 100%.

Jest jeszcze **mockowanie** - tworzenie atrapy obiektu (_mock object_).
Tego się używa do testów funkcjonalnych. Chociaż narzędzie do testów jednostkowych też da radę do testów funkcjonalnych.
Więcej o tym będzie później.

