package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Herdier extends Lillipup {
    public Herdier(String name, int level) {
        super(name, level);
        setStats(65, 80, 65, 35, 65, 60);
        setType(Type.NORMAL);
        setMove(new Facade(), new DoubleTeam(), new RockTomb());
    }
}
