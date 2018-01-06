### Tablice
Tablice są fajne. Chociaż starożytne.
W tablicach nie ma dynamicznego alokowania pamięci.
Tablice deklarujemy tak:

```JAVA
int [100] value
value [3] = 2
```

Każda tablica jest obiektem. Nie jest zmienną generyczną!
A ponieważ toejst obiekt, to sięje tworzy przez `new`!

### Instrukcje warunkowe
Jak w każdym innym języku. Jeśli po warunku nie ma klamer, to instrukcją warunkową jest tylko pierwsza linijka. Ale nawet jeśli jest tylko jedna instrukcja to **zawsze** zawsze dawać ją w klamerki. Tak, żeby było wiadomo co autor miał na myśli, a nie, że się kopnął;

```JAVA
if (x == 7) {
// tu kod;
} else if (x == 5) {
// tu kod;
} else {
// tu kod;
}
```

### Operatory

Jak w cpp: `==, !=, >, <. >=, <=`
Nie ma: `&&, ++`

### Switch case
Można używać, ale w Javie go nie lubią. Czy oni w ogóle coś lubią?

```JAVA
switch (x) {
case 0:
// wykonaj kod
//fall through  -> tu nie ma break, więc wykona się też case 1, ale dodawać komentarz
case 1:
// wykonaj kod;
break;
case 2:
// wykonaj kod;
break;
case 3:
// wykonaj kod;
break;
default:
// wykonaj kod;
}
```

Jeśli nie postawimy break to wykona się też kolejny case.
Można tego używać (bo to miewa sens), ale dodawać wtedy komentarz //fall through
Wyrażeniem wyboru (czyli x) może być **int, long, String** (String od Java7)

Switch case ma sens, jeśli jest klika warunków dotyczących jednej zmiennej -> jeśli piszemy to w if else, to trzeba zawsze spojrzeć czy teraz warunek dotyczy tej samej zmiennej, czy jednak nie innej tym razem.
Ale programiści Javy i tak się z tym nie zgodzą.

### Ternary operator
Operator trójargumentowy
```JAVA
b = a == 3 ? 5 : 19
//czyli:
if (a == 3) {
b = 5;
} else {
b = 19
};
```
> Prosty ternary jest prosty. Ale ternary z ternary w środku nawet dla mnie jest skomplikowany.
@jbanaszczyk, 2018

##Iterujemy
No to iterujemy.
Iteruje się pętlami.
Pętle znamy i lubimy.
Pętle:
+ for

```Java
for (int i = 0; i < 10; ++i) {
// tu wykonuj kod
};
```
Zwiększać ++i, a nia i++ -> nie słuchać Stack Overflow;
Jeśli zwiększamy i++ to najpierw zapisujemy w pamięci poprzednią wartość a dopiero potem ją zwiększamy;
