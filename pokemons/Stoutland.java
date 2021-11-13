package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Stoutland extends Herdier {
    public Stoutland(String name, int level) {
        super(name, level);
        setStats(85, 110, 90, 45, 90, 80);
        setType(Type.NORMAL);
        setMove(new Facade(), new DoubleTeam(), new RockTomb(), new Swagger());
    }
}
