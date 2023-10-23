package Sports.Couch;

public class TableTennisCoach extends Coach {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("This team's coach, "+this.getName()+", is showing the right way to hit a curve ball.");
    }
}
