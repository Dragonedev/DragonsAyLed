package battle;

import attacks.*;
import dragons.Crayled;
import dragons.Dragons;
import dragons.Exayled;
import dragons.Leayled;
import player.Player;
import skins.Aether;
import skins.Cryon;
import skins.Pyro;

import java.util.Scanner;

public class Battle {

    public static void start(Scanner sc) {
        Battle.standartBattle(sc);
    }

    public static void standartBattle(Scanner sc) {

        Player player1 = Patterns.playersChoose(sc, 1);

        sc.nextLine();

        Player player2 = Patterns.playersChoose(sc, 2);

        Patterns.standartRound(player1.getDragon(), player2.getDragon(), sc);

        Patterns.showWinner(player1.getDragon(), player2.getDragon(), player1.getNick(), player2.getNick());

        sc.close();
    }


}
