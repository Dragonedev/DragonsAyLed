package battle;

import dragons.Crayled;
import dragons.Dragons;
import dragons.Exayled;
import dragons.Leayled;

public class DragonMenu {

    public static void show() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║              DRAGONS                 ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ [1] Crayled                          ║");
        System.out.println("║ [2] Exayled                          ║");
        System.out.println("║ [3] Leayled                          ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("Choose your dragon: ");
    }

    public static Dragons choose(int dragon) {

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
