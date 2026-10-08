import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion1 = new Lion("Simba", 100);
        Lion lion2 = new Lion("Mufasa", 150);
        Wolf wolf = new Wolf("Ulfi", 80);
        Rabbit rabbit = new Rabbit("Snoresnup");

        animals.add(lion1);
        animals.add(lion2);
        animals.add(wolf);
        animals.add(rabbit);

        System.out.println("ANIMAL COMPETITION!!!\n");

        for (int i = 0; i < animals.size(); i++) {
            Animal team1 = animals.get(i);
            Animal team2 = animals.get(i + 1);

            System.out.println(team1.getName() + " vs " + team2.getName());

            Contest thisContest = new Contest(team1, team2);

            while (thisContest.getWinner() == null && team1.isActive() && team2.isActive()) {
                thisContest.playRound();
            }

            Animal winner = thisContest.getWinner();
            if (winner != null) {
                System.out.println("Weeee have a winner " + winner.getName());
            } else {
                System.out.println("The battle ended in a draw :(");
            }
        }
    }
}



            // Jeg har ikke i min sp1 opgave noget komposistion men jeg kunde have gjordt det med inventory altså at min klasse charecter
            // havde ArrayList<Item>items (Has-a). Derudover kunne jeg også have lavet Item til en supklassse (altså nedarvining) hvor at
            // fx bue, sværd og skjold, kunne have været subklasserne (Is-a).