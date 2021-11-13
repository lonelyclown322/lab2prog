package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;


public class Wishiwashi extends Pokemon {
    public Wishiwashi(String name, int level) {
        super(name, level);
        setStats(45, 20, 20, 25, 25, 40);
        setType(Type.WATER);
        setMove(new Blizzard(), new Screech(), new RockTomb(), new DefenseCurl());
    }
}
