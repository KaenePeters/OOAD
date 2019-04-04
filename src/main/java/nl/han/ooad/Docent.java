package nl.han.ooad;

import java.util.ArrayList;

public class Docent {

    private ArrayList<Kennistoets> toetsen;
    private String email;
    private String voornaam;
    private String achternaam;
    private String wachtwoord;
    private boolean premium;

    public Docent(String email, String voornaam, String achternaam, String wachtwoord, boolean premium) {
        toetsen = new ArrayList<>();
        this.email = email;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
        this.premium = premium;
    }

    public void maakKennistoets(String code, String titel) {
        Kennistoets kennistoets = new Kennistoets(code, titel);
        toetsen.add(kennistoets);
    }


    public Kennistoets getKennistoets(String code) {
        Kennistoets kennistoets = null;
        for (Kennistoets toets : toetsen) {
            if (toets.getCode().equals(code)) {
                kennistoets = toets;
            } else {
                throw new RuntimeException("Kennistoets met Code: " + code + "bestaat niet");
            }
        }
        return kennistoets;
    }

}

