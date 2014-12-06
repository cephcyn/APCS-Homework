public class Grass extends Pokemon {

    public Grass(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }

    public Grass(String name, Attack[] attacks) {
        super(name, attacks);
    }

    public boolean isWeak(Pokemon pokemon) {
        return pokemon instanceof Fire;
    }

    public boolean isResistant(Pokemon pokemon) {
        return pokemon instanceof Water;
    }
}
