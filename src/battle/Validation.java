package battle;

import dragons.Dragons;

public class Validation {
    public static boolean finish(Dragons dragon) {
        return dragon.getLife() > 0 || dragon.getSpeed() > 0;
    }

    public static int winner(Dragons dragon1, Dragons dragon2) {
        if (dragon1.getLife() == 0 && dragon1.getSpeed() == 0) {
            return 2;
        } else if (dragon2.getLife() == 0 && dragon2.getLife() == 0) {
            return 1;
        }

        return 0;
    }

    public static Dragons switchTurn(Dragons dragonTurn, Dragons dragon1, Dragons dragon2) {
        if (dragonTurn.equals(dragon1)) {
            return dragon2;
        } else {
            return dragon1;
        }
    }

    public static Dragons switchEnemy(Dragons dragonTurn, Dragons dragon1, Dragons dragon2) {
        if (dragonTurn.equals(dragon1)) {
            return dragon2;
        } else {
            return dragon1;
        }
    }
}
