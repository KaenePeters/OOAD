package nl.han.ooad;

import java.util.ArrayList;

public class Odinido {
    ArrayList<Lokaal> lokalen = new ArrayList<>();
    ArrayList<Uitvoering> uitvoeringen = new ArrayList<>();
    ArrayList<Docent> docenten = new ArrayList<>();

    public Odinido() {
    }

    public void aanmelden(String naam, Lokaal lokaal) {
        Student student = new Student(naam, lokaal);
    }

    public void aanmakenUitvoering(int nummer, String titel) {
    }


}
