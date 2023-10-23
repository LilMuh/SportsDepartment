package Sports.Athletes;

import Sports.SpeakEnglish;

public class BasketballAthlete extends Athlete {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println(this.getName() + " is training handles, catch and shoot");
    }

}
