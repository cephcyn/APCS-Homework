public class Fire extends Pokemon {

    public Fire(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }

    public Fire(String name, Attack[] attacks) {
        super(name, attacks);
    }

    //etc methods
    public boolean isWeak(Pokemon pokemon) {
        return pokemon instanceof Water;
    }

    public boolean isResistant(Pokemon pokemon) {
        return pokemon instanceof Grass;
    }
}
