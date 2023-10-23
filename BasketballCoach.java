package Sports.Couch;

import Sports.SpeakEnglish;

public class BasketballCoach extends Coach implements SpeakEnglish {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("The basketball coach, "+this.getName()+", is coaching the dream team for the world cap.");
    }

    @Override
    public void speak() {
        System.out.println(this.getName()+" yells out loud: Come on! You guys are winning the next one!");
    }
}
