public class Water extends Pokemon {

    public Water(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }

    public Water(String name, Attack[] attacks) {
        super(name, attacks);
    }

    //etc methods
    public boolean isWeak(Pokemon pokemon) {
        return pokemon instanceof Grass;
    }

    public boolean isResistant(Pokemon pokemon) {
        return pokemon instanceof Fire;
    }
}
