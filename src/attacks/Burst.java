package attacks;

import dragons.Dragons;

public class Burst extends Attack {

    public Burst(Dragons dragon){
        setName("Burst");
        setDragons(dragon);
        setDamageOnLife(35.0);
        setDamageOnSpeed(25.0);
    }
}
