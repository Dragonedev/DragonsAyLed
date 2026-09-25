package attacks;

import dragons.Dragons;

public class Bolt extends Attack {

    public Bolt(Dragons dragon){
        setName("Bolt");
        setDragons(dragon);
        setDamageOnLife(30.0);
        setDamageOnSpeed(30.0);
    }
}
