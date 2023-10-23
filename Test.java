package Sports;

import Sports.Athletes.BasketballAthlete;
import Sports.Athletes.TableTennisAthlete;
import Sports.Couch.BasketballCoach;
import Sports.Couch.TableTennisCoach;

public class Test {
    public static void main(String[] args) {
        BasketballAthlete zheLin = new BasketballAthlete("王哲林", 24);
        TableTennisAthlete jiKe = new TableTennisAthlete("张继科",35);
        BasketballCoach bobo = new BasketballCoach("Gregg Popovich", 74);
        TableTennisCoach guoDong = new TableTennisCoach("刘国栋", 41);

        // Basketball
        bobo.teach();
        zheLin.train();
        bobo.speak();

        // TableTennis
        guoDong.teach();
        jiKe.train();
        jiKe.speak();
    }
}
