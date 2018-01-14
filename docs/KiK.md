### Kółko i krzyżyk
Wymgania:
+ żeby się dało grać wieloosobowo;
+ żeby się dało oglądać wynik na boku (klasa showGame);

**Architektura MVC (_Model View Controller_)**
MVC służy do organizowania struktury aplikacji posiadajacy graficzny interfejs użytkownika.

Ma być prosty, ale nie naiwny -> rozdzielić dane od wykonywania operacji;
Są różne warianty (pasywny, aktywny...). Zrobimy najprostsze.

**Składowe MVC:**
+ **_Controller_** - coś co wydaje polecenia;
+ **_Model_** - coś co trzyma dane;
+ **_View_** - coś co pokazuje, obserwator;

Generalnie chodzi o to, żeby rozdzielić najwięcej elementów.
_view - controller_ : nie ma żadnego połączenia; gracz ma myszkę, widok ma monitor.
_model - controller_ : połączenie w jedną stronę (cotroller -> model);
_view - model_ : połączenie w obie strony; (view <-> model);

---

Enum - typ wyliczeniowy, która ma tyle zmiennych ile wypiszemy
`enum XO {YES, NO, EMPTY}`

3 klasy:

**Model:**
+ enum XO {YES, NO, EMPTY} -> tablica zmiennych typu enum;
+ boolean isEmpty (x, y);
+ void setBoard (x, y, XO);
+ XO[][] getBoard();
+ XO winner();
+ boolean isPlaying();
+ XO[][] whoIsWinner();
+ void nextOne();   -> do sterowania konctrolerami
+ void changed()
+ void reset();

**View:**
+ void event();
+ private void print();

**Controller:**
+ abstract class ControllerMain {void makeMove() } -> nadrzędna, pozostałe po niej dziedziczą (_is a_):
    + controllerAi
    + controllerMan

---
Doczytać:
- abstract Class vs Interface;
- jak robić notifikacje -> najprościej setterami!
    - na zakończenie metody zawołać changed() która zawoła metodę event() która zawoła metodę print();

Zrobić klasy i zaproponować maina który konstruuje obiekty;
Jak coś ma coś zwracać to neich zwraca jakiś false, albo null - bez unit testów.
