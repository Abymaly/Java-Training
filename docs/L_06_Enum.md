

Enum - typ wyliczeniowy, która ma tyle zmiennych ile wypiszemy. Enumy wielkimi, podkreślnik zamiast spacji;

```JAVA
enum XO {TIC, TAC, EMPTY};
XO xo = XO.TIC;

if (xo == XO.TAC) {
// jakiś kod;
}

switch (xo) {
    case TAC:
        break;
    case EMPTY:
        break;
}
```

**Każdy enum to jest klasa!**

Każdy zmienna typu enum ma swoje metody.
Enuma można przepytać o wartości i o sporo innych rzeczy.

```JAVA
enum XO {
    TIC ("X"),
    TAC ("Y"),
    EMPTY (" ");

    String symbol;                  \\ to jest pole klasy

    XO (String symbol) {            \\ to jest konstruktor
        this.symbol = symbol;
    }

    public String getSymbol() {     \\ to jest getter
        return symbol;
    }

    xo.getSymbol();                 \\ a to jest wywyołanie metody
```

Co więcej - może być enum w enumie. Bo czemu nie?
Enum można zrobić w osobnej klasie typu enum. Czy używać - jak zwykle, to zależy. To jest pole do nadużyć ale można. Bo można też zadeklarować enum w innej klasie.

Jeśli wykorzystujemy enuma w innej klasie to on już jest stworzony (**to jest singleton**). Nie trzeba robić new, on już istnieje! Dlaczego - będzie później, na razie ostrożnie z tym.

Forlamnie można zrobić setter, w sensie IDE nie zaprotestuje. Ale enum jest stały, dodawanie settera jest zaprzeczeniem stałości.
Po to mamy enuma żeby mieć stałe.
> Jeśli robisz setter w enumie, to znaczy, że się pogubiłeś w życiu. Jedni biorą kokainę, inni robią setter w enumie.


-------------------------------------

Konwencja w enumie: tylko wielkie litery bez spacji;
To koncepcja zaporzyczona z C, że zmienne niezmienne zapisujemy wielkimi. Zostało tylko w enumie;