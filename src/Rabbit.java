public class Rabbit extends Animal {

    Rabbit(String name) {
        super(name, 200);
    }

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String toString() {
        return "Rabbit " + getName() + " (Energy: " + getEnergy() + ")";
    }
}
