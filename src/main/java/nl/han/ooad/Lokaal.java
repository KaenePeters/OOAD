package nl.han.ooad;

import java.util.ArrayList;

public class Lokaal {

    int nummer;
    ArrayList<Student> studenten = new ArrayList<>();


    public Lokaal(int nummer){
        this.nummer = nummer;
    }

    public void startKennistoets(String titel){
        Kennistoets kennistoets = new Kennistoets(titel);
    }

    public void addStudent(Student student){
        studenten.add(student);
    }


}
