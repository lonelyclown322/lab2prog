package moves;

import ru.ifmo.se.pokemon.*;


public class Swift extends SpecialMove {
    public Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Swift";
    }
}
