import java.util.Random;

public class Wolf extends Animal {

    private Random randomNumber = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return randomNumber.nextInt(20) + 1;
    }

    @Override
    public String toString() {
        return "Wolf " + getName() + " (Energy: " + getEnergy() + ")";
    }
}
