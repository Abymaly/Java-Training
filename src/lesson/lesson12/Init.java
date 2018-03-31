package lesson.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Init {

    void approach01() {
        List<String> places = new ArrayList<>();
        places.add("Buenos Aires");
        places.add("Cordoba");
        places.add("La Plata");
    }

    void approach02() {             // to jest deklaracja klasy anonimowej (patrz Lambda), interfejsujący się do listy
        List <String> places = new ArrayList<String>() {
            {                       // fragment w klamrach to blok inicjujący; to jest klasa zainicjowana trzema wartościami. One są wbite do klasy
                add("Buenos Aires");
                add("Cordoba");
                add("La Plata");
            }
        };
    }
}
