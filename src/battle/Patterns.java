package battle;

import dragons.Dragons;
import player.Player;

import java.util.Scanner;

public class Patterns {
    public static void standartRound(Dragons dragon1, Dragons dragon2,Scanner sc){
        Dragons dragonTurn = dragon1;
        Dragons enemyDragon = null;
        int i = 1;
        int attack = 0;

        while (Validation.finish(dragon1) && Validation.finish(dragon2)) {
            System.out.println("\n[BATTLE] <ROUND " + i + "> (" + dragonTurn.getName() +
                    " " + dragonTurn.getSkin().getName() + ")");
            enemyDragon = Validation.switchEnemy(dragonTurn, dragon1, dragon2);
            do {
                AttackMenu.show();
                attack = sc.nextInt();
            } while (attack <= 0 || attack > 3);
            AttackMenu.choose(attack, dragonTurn, enemyDragon);
            dragonTurn = Validation.switchTurn(dragonTurn, dragon1, dragon2);
            i++;
        }
    }

    public static void showWinner(Dragons dragon1, Dragons dragon2, String nick1, String nick2){
        if (Validation.winner(dragon1, dragon2) == 1) {
            System.out.println("\n" + nick1 + " WINS w/ " + dragon1.getName() + " " + dragon1.getSkin().getName());
        } else if (Validation.winner(dragon1, dragon2) == 2) {
            System.out.println("\n" + nick2 + " WINS w/ " + dragon2.getName() + " " + dragon2.getSkin().getName());
        } else {
            System.out.println("Error");
        }
    }

    public static Player playersChoose(Scanner sc, int i) {
        int codigo;

        System.out.print("[DRAGON] - Type your nick: ");
        String nick = sc.nextLine();

        DragonMenu.show();
        codigo = sc.nextInt();
        Dragons dragon = DragonMenu.choose(codigo);

        SkinMenu.show();
        codigo = sc.nextInt();
        SkinMenu.choose(dragon, codigo);

        return new Player(nick, dragon);
    }

}
