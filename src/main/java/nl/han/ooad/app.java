package nl.han.ooad;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        //Aanmaak van objecten die controllen en nodig zijn om andere objecten aan te maken.
        Odinido odinido = new Odinido();
        Docent Herman = new Docent("test@test.nl", "Herman", "Telman", "mijnWachtwoord", false);
        Lokaal lokaal1 = new Lokaal(1);
        Student student = new Student("Kaene Peters", lokaal1);
        Scanner s = new Scanner(System.in);
        //aanmaak objecten om een kennistoets uit te voeren
        odinido.docenten.add(Herman);
        Herman.maakKennistoets("ODI23644129", "Requirements");
        Kennistoets huidigeKennistoets = Herman.getKennistoets("ODI23644129");


        //aanmaak uitvoering
        odinido.aanmakenUitvoering(1, huidigeKennistoets, lokaal1, 7200);
        lokaal1.addStudent(student);
       // long startUitvoering = System.currentTimeMillis();

        for (Student studentInUitvoering : lokaal1.studenten) {
            studentInUitvoering.voerToetsUit();
        }


        lokaal1.maakOverzichtspagina();

        odinido.stopUitvoering(lokaal1);
    }


}
