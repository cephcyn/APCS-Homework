public class Vaporeon extends Water {

    public Vaporeon() {
        //name is Vaporeon, inits and fills a new array to send to constructor
        super("Vaporeon", new Attack[]{
            new Attack("Hydro Beam", 30, 10), 
            new Attack("Aurora Beam", 20, 10), 
            new Attack("Water Pulse", 10)});
    }
}
