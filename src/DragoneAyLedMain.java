import attacks.*;
import battle.Battle;
import dragons.Crayled;
import dragons.Dragons;
import dragons.Exayled;

import java.util.Scanner;

public class DragoneAyLedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("[DRAGON1]");
        Battle.dragonMenu();
        codigo = sc.nextInt();
        Dragons dragon1 = Battle.chooseDragon(codigo);

        Battle.skinMenu();
        codigo = sc.nextInt();
        Battle.switchSkin(dragon1, codigo);

        System.out.println("\n[DRAGON2]");
        Battle.dragonMenu();
        codigo = sc.nextInt();
        Dragons dragon2 = Battle.chooseDragon(codigo);

        Battle.skinMenu();
        codigo = sc.nextInt();
        Battle.switchSkin(dragon2, codigo);

        Dragons dragonTurn = dragon1;
        Dragons enemyDragon = null;

        System.out.println("\n[BATTLE]");
        while (Battle.validateBattle(dragon1) && Battle.validateBattle(dragon2)) {
            enemyDragon = Battle.switchEnemy(dragonTurn, dragon1, dragon2);
            Battle.attacksMenu();
            int attack = sc.nextInt();
            Battle.switchAttack(attack,dragonTurn,enemyDragon);
            dragonTurn = Battle.switchTurn(dragonTurn, dragon1, dragon2);
        }
    }
}

