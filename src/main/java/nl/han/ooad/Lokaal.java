package nl.han.ooad;

import java.util.ArrayList;

public class Lokaal {

    ArrayList<Student> studenten = new ArrayList<>();
    private int nummer;
    private Uitvoering huidigeUitvoering;


    public Lokaal(int nummer) {
        this.nummer = nummer;
    }

    public void maakOverzichtspagina() {
        String naam = "";
        int score;
        System.out.println("Overzicht voor gemaakte kennistoets:");

        for (Student student : studenten) {
            naam = student.getNaam();
            score = student.getScore();
            System.out.println(naam + " heeft een score van: " + score);
        }

    }

    public void startUitvoering(int code, Kennistoets kennistoets, int tijd) {
        huidigeUitvoering = new Uitvoering(code, kennistoets, this,tijd);

    }

    public void addStudent(Student student) {
        studenten.add(student);
        student.setUitvoering(huidigeUitvoering);
    }

    public void sluitLokaal(Odinido odinido) {

        for (Uitvoering uitvoering : odinido.uitvoeringen) {
            if (uitvoering == huidigeUitvoering) {
                uitvoering = null;

            }
        }
    }

    public Uitvoering getHuidigeUitvoering() {
        return huidigeUitvoering;
    }


}
