package nl.han.ooad.Util;


import nl.han.ooad.Vraag;

import java.util.ArrayList;

public class OdinidoToetsbank {

    public ArrayList<Vraag> maakVragenVoorToetsODI23644129() {
        ArrayList<Vraag> vragen = new ArrayList<>();

        Vraag vraag1 = new Vraag("Welke van de begrippen needs, features en requirements horen bij het solution domain?", 1, 10);
        vraag1.voegAntwoordToe(1, "needs, features en requirements", false);
        vraag1.voegAntwoordToe(2, "needs en requirements", false);
        vraag1.voegAntwoordToe(3, "features en requirements", true);
        vraag1.voegAntwoordToe(4, "alleen requirements", false);
        vragen.add(vraag1);


        Vraag vraag2 = new Vraag("Wat wordt bedoeld met �elicit needs from stakeholders�?", 2, 10);
        vraag2.voegAntwoordToe(1, "Het boven tafel krijgen van de needs van belanghebbenden.", true);
        vraag2.voegAntwoordToe(2, "Het documenteren van de needs van belanghebbenden.", false);
        vraag2.voegAntwoordToe(3, "Het valideren van de needs van belanghebbenden.", false);
        vraag2.voegAntwoordToe(4, "Het vertalen van de needs van belanghebbenden naar software features.", false);
        vragen.add(vraag2);

        Vraag vraag3 = new Vraag("Welke term wordt gebruikt voor �the ability to describe and follow the life of a requirement, in both forwards and backwards direction�?", 3, 10);
        vraag3.voegAntwoordToe(1, "traceability", true);
        vraag3.voegAntwoordToe(2, "tracebility", true);
        vraag3.voegAntwoordToe(3, "traceabillity", true);
        vraag3.voegAntwoordToe(4, "tracebillity", true);
        vragen.add(vraag3);

        Vraag vraag4 = new Vraag("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak.\r\n"
                + "Aan het begin van het project heb je de requirements opgesteld.\r\n"
                + "Op welke momenten in het project kunnen de requirements gewijzigd worden?", 4, 10);
        vraag4.voegAntwoordToe(1, "Op elk gewenst moment.", false);
        vraag4.voegAntwoordToe(2, "Na elke iteratie.", true);
        vraag4.voegAntwoordToe(3, "Niet meer, de requirements liggen vast.", false);
        vragen.add(vraag4);

        Vraag vraag5 = new Vraag("In welke categorie valt de volgende eis?\r\n"
                + "R1. Het systeem moet 75% van de webpagina's binnen 2 seconden tonen.\r\n "
                + "   Voor de overige pagina's mag het nooit langer dan 5 seconden duren.", 5, 10);
        vraag5.voegAntwoordToe(1, "Functionality", false);
        vraag5.voegAntwoordToe(2, "Usability", false);
        vraag5.voegAntwoordToe(3, "Reliability", false);
        vraag5.voegAntwoordToe(4, "Performance", true);
        vraag5.voegAntwoordToe(5, "Supportability", false);
        vragen.add(vraag5);

        return vragen;
    }

    public ArrayList<Vraag> maakToetsODI24878686() {
        // TO DO: vul hier zelf een toets in
        return null;
    }


}
