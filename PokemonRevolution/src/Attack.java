public class Attack {

    private String name;
    private int value;
    private int energy;

    public Attack(String name, int value, int energy) {
        //invariant testing
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must contain something!");
        }
        if (Math.abs(value) > 50 || value % 10 != 0) {
            throw new IllegalArgumentException("Value must be a multiple of ten and between -50 and 50 inclusive!");
        }
        if (energy < 0 || energy % 10 != 0) {
            throw new IllegalArgumentException("Energy must be a positive multiple of ten!");
        }
        //setting
        this.name = name;
        this.value = value;
        this.energy = energy;
    }

    public Attack(String name, int value) {
        this(name, value, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public int getEnergy() {
        return this.energy;
    }

    public String toString() {
        return this.name + ": " + this.value + " " + this.energy;
    }
}
