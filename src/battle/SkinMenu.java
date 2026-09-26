package battle;

import dragons.Dragons;
import skins.Aether;
import skins.Cryon;
import skins.Pyro;

public class SkinMenu {

    public static void show() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║                    SKINS                   ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ [1] Pyro          Color: Red               ║");
        System.out.println("║ [2] Aether        Color: White             ║");
        System.out.println("║ [3] Cryon         Color: Dark Purple       ║");
        System.out.println("╚════════════════════════════════════════════╝");

        System.out.print("Choose your skin: ");
    }

    public static void choose(Dragons dragon, int skin) {

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
}
