package battle;

import attacks.*;
import dragons.Dragons;

public class AttackMenu {

    public static void show() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                    ATTACKS                       ║");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.println("║                                                  ║");
        System.out.println("║  [1] Bolt       Life: 30hp     Speed: 30spd      ║");
        System.out.println("║  [2] Burst      Life: 35hp     Speed: 25spd      ║");
        System.out.println("║  [3] Claw       Life: 40hp     Speed: 20spd      ║");
        System.out.println("║  [4] Strike     Life: 20hp     Speed: 40spd      ║");
        System.out.println("║                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");

        System.out.print("Choose your attack: ");
    }

    public static void choose(int attack, Dragons dragonTurn, Dragons enemyDragon) {
        switch (attack) {
            case 1:
                AttackMenu.bolt(dragonTurn, enemyDragon);
                break;
            case 2:
                AttackMenu.burst(dragonTurn, enemyDragon);
                break;
            case 3:
                AttackMenu.claw(dragonTurn, enemyDragon);
                break;
            case 4:
                AttackMenu.strike(dragonTurn, enemyDragon);
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void message(Dragons dragonTurn, Dragons enemyDragon, Attack attacker) {

        System.out.println(
                dragonTurn.getName() + " " +
                        dragonTurn.getSkin().getName() + " attacked " +
                        enemyDragon.getName() + " " +
                        enemyDragon.getSkin().getName() +
                        " with " + attacker.getName() +
                        "\nENEMY DRAGON:" +
                        "\nLife: " + enemyDragon.getLife() +
                        "\nSpeed: " + enemyDragon.getSpeed()
        );
    }

    public static void bolt(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Bolt(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        message(dragonTurn, enemyDragon, attacker);
    }

    public static void burst(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Burst(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        message(dragonTurn, enemyDragon, attacker);
    }

    public static void claw(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Claw(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        message(dragonTurn, enemyDragon, attacker);
    }

    public static void strike(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Strike(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        message(dragonTurn, enemyDragon, attacker);
    }


}
