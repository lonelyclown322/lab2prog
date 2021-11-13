package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Lillipup extends Pokemon {
    public Lillipup(String name, int level) {
        super(name, level);
        setStats(45, 60, 45, 25, 45, 55);
        setType(Type.NORMAL);
        setMove(new Facade(), new DoubleTeam());
    }
}
