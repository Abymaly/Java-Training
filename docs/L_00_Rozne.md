Java powstała jako negacja do C++

Java i C# to w zasadzie to samo. Jak nie ma dokumentacji do czegoś w javie to można śmiało czytać dokumentację do C#, trudno je odróżnić, prawie na peno będzie pasowało

Fluent API - żeby metoda zwracała coś tego samego typu co dane wyjściowe. Czyli, żeby metoda operująca na stringach zwracała stringi;
- jeżeli tworząc klasę da się tak zrobić, to warto robić;

Po to są settery i gettery, żeby można było przejąć kontrolę nad zmianą. I uchwycić dokładnie moment zmiany.
Jeśli w konstruktorze na sztywno przypisujemy wartości, to wtedy nie przechodzimy przez settera. Nie ma kontroli nad tym co się dzieje. Może warto by było używać setterów też w konstruktorze?