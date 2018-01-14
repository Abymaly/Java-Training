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

