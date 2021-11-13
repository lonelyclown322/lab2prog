import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Lillipup p1 = new Lillipup("Вратарь", 1);
        Wingull p2 = new Wingull("Защитник", 1);
        Pelipper p3 = new Pelipper("Нападающий", 1);

        Herdier p4 = new Herdier("Вратарь", 1);
        Stoutland p5 = new Stoutland("Защитник", 1);
        Wishiwashi p6 = new Wishiwashi("Нападающий", 1);

        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);

        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);

        battle.go();
    }
}
