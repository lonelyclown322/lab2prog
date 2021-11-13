package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Pelipper extends Wingull {
    public Pelipper(String name, int level) {
        super(name, level);
        setStats(60, 50, 100, 95, 70, 65);
        setType(Type.FLYING, Type.WATER);
        setMove(new Facade(), new DoubleTeam(), new Confide(), new Swift());
    }
}
