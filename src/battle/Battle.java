package battle;

import attacks.*;
import dragons.Crayled;
import dragons.Dragons;
import dragons.Exayled;
import dragons.Leayled;
import skins.Aether;
import skins.Cryon;
import skins.Pyro;

public class Battle {

    public static boolean validateBattle(Dragons dragon) {
        return dragon.getLife() > 0 || dragon.getSpeed() > 0;
    }

    public static void attacksMenu() {

        System.out.println();
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

    public static void attackMessage(Dragons dragonTurn, Dragons enemyDragon, Attack attacker) {

        System.out.println(
                dragonTurn.getName() + " attacked " +
                        enemyDragon.getName() + " " +
                        enemyDragon.getSkin().getName() +
                        " with " + attacker.getName() +
                        "\nENEMY DRAGON:" +
                        "\nLife: " + enemyDragon.getLife() +
                        "\nSpeed: " + enemyDragon.getSpeed()
        );
    }
    public static void boltAttack(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Bolt(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        attackMessage(dragonTurn, enemyDragon, attacker);
    }

    public static void burstAttack(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Burst(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        attackMessage(dragonTurn, enemyDragon, attacker);
    }

    public static void clawAttack(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Claw(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        attackMessage(dragonTurn, enemyDragon, attacker);
    }

    public static void strikeAttack(Dragons dragonTurn, Dragons enemyDragon) {

        Attack attacker = new Strike(dragonTurn);

        attacker.applyDamageOnLife(enemyDragon);
        attacker.applyDamageOnSpeed(enemyDragon);

        attackMessage(dragonTurn, enemyDragon, attacker);
    }

    public static void switchAttack(int attack, Dragons dragonTurn, Dragons enemyDragon){
        switch (attack) {
            case 1:
                Battle.boltAttack(dragonTurn, enemyDragon);
                break;
            case 2:
                Battle.burstAttack(dragonTurn, enemyDragon);
                break;
            case 3:
                Battle.clawAttack(dragonTurn, enemyDragon);
                break;
            case 4:
                Battle.strikeAttack(dragonTurn, enemyDragon);
                break;
            default:
                System.out.println("Error");
        }
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

    public  static void skinMenu(){
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║              SKINS                   ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ [1] Pyro                             ║");
        System.out.println("║ [2] Aether                           ║");
        System.out.println("║ [3] Cryon                            ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("Choose your skin: ");
    }

    public static void switchSkin(Dragons dragon, int skin) {

        switch (skin) {
            case 1:
                dragon.setSkin(new Pyro());
                break;

            case 2:
                dragon.setSkin(new Aether());
                break;

            case 3:
                dragon.setSkin(new Cryon());
                break;

            default:
                System.out.println("Invalid skin.");
        }
    }

    public static void dragonMenu(){
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║              DRAGONS                 ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ [1] Crayled                          ║");
        System.out.println("║ [2] Exayled                          ║");
        System.out.println("║ [3] Leayled                          ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("Choose your dragon: ");
    }

    public static Dragons chooseDragon(int dragon) {

        switch (dragon) {
            case 1:
                return new Crayled();

            case 2:
                return new Exayled();

            case 3:
                return new Leayled();

            default:
                System.out.println("Invalid dragon.");
        }
        return null;
    }
}
