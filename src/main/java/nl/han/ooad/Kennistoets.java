package nl.han.ooad;

import nl.han.ooad.Util.OdinidoToetsbank;

import java.util.ArrayList;

public class Kennistoets {

    ArrayList<Vraag> vragen = new ArrayList<>();
    private String titel;
    private String code;

    public Kennistoets(String code, String titel) {
        this.code = code;
        this.titel = titel;
        if (code.equals("ODI23644129")) {
            OdinidoToetsbank odinidoToetsbank = new OdinidoToetsbank();
            vragen = odinidoToetsbank.maakVragenVoorToetsODI23644129();

        }
        if (code.equals("ODI24878686")) {
            OdinidoToetsbank odinidoToetsbank = new OdinidoToetsbank();
            vragen = odinidoToetsbank.maakVragenVoorToetsODI23644129();
        }
    }

    public void addVraag(Vraag vraag) {
        vragen.add(vraag);
    }


    public String getCode() {
        return code;
    }

    public int getAantalVragen() {
        return vragen.size();

    }

    public Vraag getVraag(int nummer) {
        for (Vraag vraag : vragen) {
            if (vraag.getNummer() == (nummer)) {
                return vraag;
            }
        }
        return vragen.get(0);
    }
}