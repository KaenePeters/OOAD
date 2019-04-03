package nl.han.ooad;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
    Odinido odinido = new Odinido();

        Docent Herman = new Docent("test@test.nl", "Herman", "Telman", "mijnWachtwoord", false);
        odinido.docenten.add(Herman);
        Herman.maakKennistoets("ODI23644129", "Requirements");

        Lokaal lokaal = new Lokaal(1);
        lokaal.startUitvoering(Herman.getKennistoets("ODI23644129"));
    }
}
