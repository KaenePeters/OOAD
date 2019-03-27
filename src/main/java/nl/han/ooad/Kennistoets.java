package nl.han.ooad;

import java.util.ArrayList;

public class Kennistoets {

    ArrayList<Vraag> vraagen = new ArrayList<>();
    private String titel;

    public Kennistoets(String titel) {
        this.titel = titel;
    }

    public void addVraag(Vraag vraag) {
        vraagen.add(vraag);
    }

}
