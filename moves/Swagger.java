package moves;

import ru.ifmo.se.pokemon.*;


public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
        Effect raise = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(raise);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
