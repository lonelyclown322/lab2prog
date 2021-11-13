package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Wingull extends Lillipup {
    public Wingull(String name, int level) {
        super(name, level);
        setStats(40, 30, 30, 55, 30, 85);
        setType(Type.WATER, Type.FLYING);
        setMove(new Facade(), new DoubleTeam(), new Confide());
    }
}
