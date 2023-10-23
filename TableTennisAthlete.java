package Sports.Athletes;

import Sports.SpeakEnglish;

public class TableTennisAthlete  extends Athlete implements SpeakEnglish {
    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println(this.getName()+" is training about postures and steps");
    }

    @Override
    public void speak() {
        System.out.println(this.getName()+" says : Our opponents for the next game are very competitive. " +
                "We'd better be well prepared.");
    }
}