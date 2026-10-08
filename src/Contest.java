public class Contest {

    private Animal animal1;
    private Animal animal2;
    private int roundCount;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.roundCount = 0;
    }

    public void playRound() {
        if (!animal1.isActive() || !animal2.isActive()) {
            System.out.println("The game is over one of the contenstens is passed out!");
            return;
        }

        roundCount ++;
        System.out.println("--- Round " + roundCount + " ---");

        int damage1 =animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - damage1);
        System.out.println(animal1.getName() + " attacks " + animal2.getName() + " for " + damage1 + "! (" + animal2.getName() + " has " + animal2.getEnergy() + " left!");

        if (animal2.isActive()) {
            int damage2 = animal2.attack();
            animal1.setEnergy(animal1.getEnergy() - damage2);
            System.out.println(animal2.getName() + " Attacks " + animal1.getName() + " for " + damage2 + "! ( " + animal1.getName() + " has " + animal1.getEnergy() + "left");
        } else {
            System.out.println(animal2.getName() + " is fainted");
        }
        System.out.println();
    }

    public Animal getWinner() {
        if (animal1.isActive() && !animal2.isActive()) {
            return animal1;
        } else if (animal2.isActive() && !animal1.isActive()) {
                return animal2;
            } else {
                    return null;
        }
    }
}