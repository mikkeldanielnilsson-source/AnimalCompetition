public abstract class Animal {

    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isActive() {
        return this.energy > 0;
    }

    public abstract int attack();

    @Override
    public String toString() {
        return "Lion " + name + " (Energy: " + energy;
    }
}

