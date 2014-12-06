public class Pokemon {

    private String name;
    private int speed;
    private int defense;
    private int hp;
    private Attack[] attacks;
    private int damage;
    private int energy = 0;

    //constructors
    public Pokemon(String name, int speed, int defense, int hp, Attack[] attacks) {
        //invariant testing
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must contain something!");
        }
        if (speed <= 0 || defense <= 0 || hp <= 0) {
            throw new IllegalArgumentException("Speed, defense, and HP must be positive!");
        }
        if (attacks.length == 0) {
            throw new IllegalArgumentException("You have to have at least one attack!");
        }
        if (speed + defense + hp > 150) {
            throw new IllegalArgumentException("Speed, defense, and HP combined can't exceed 150!");
        }
        if (attacks.length > 3) {
            throw new IllegalArgumentException("You can't have more than 3 attacks!");
        }
        //attack-relevant invariant testing
        int attackvalue = 0;
        int attackenergy = 0;
        for (int i = 0; i < attacks.length; i++) {
            attackvalue += Math.abs(attacks[i].getValue());
            attackenergy += attacks[i].getEnergy();
        }
        if (attackvalue > 150) {
            throw new IllegalArgumentException("Total absolute value of its attacks cannot exceed 150!");
        }
        if (attackenergy < attackvalue / 3) {
            throw new IllegalArgumentException("Total attack energy must be more than 1/3 of its total absolute value!");
        }
        //setting
        this.name = name;
        this.speed = speed;
        this.defense = defense;
        this.hp = hp;
        this.attacks = attacks;
    }

    public Pokemon(String name, Attack[] attacks) {
        this(name, 50, 50, 50, attacks);
    }

    //mutators
    public void setDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Damage must be greater than 0!");
        }
        this.damage = damage;
    }

    public void setEnergy(int energy) {
        if (energy <= 0) {
            throw new IllegalArgumentException("Energy must be greater than 0!");
        }
        this.energy = energy;
    }

    //accessors
    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getHp() {
        return this.hp;
    }

    public Attack[] getAttacks() {
        return this.attacks;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getEnergy() {
        return this.energy;
    }

    //extra methods
    public boolean isWeak(Pokemon pokemon) {
        return false;
    }

    public boolean isResistant(Pokemon pokemon) {
        return false;
    }

    public String toString() {
        //fencepost
        String attackinfo = attacks[0] + "";
        for (int i = 1; i < attacks.length; i++) {
            attackinfo += ", " + attacks[i] + "";
        }
        //return
        return this.name + " with "
                + this.speed + " speed, "
                + this.defense + " defense, "
                + this.hp + " hit points, "
                + this.damage + " damage, "
                + this.energy + " energy, and its attacks: "
                + attackinfo;
    }

}
