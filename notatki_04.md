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
