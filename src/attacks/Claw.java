package attacks;

import dragons.Dragons;

public class Claw extends  Attack{

    public Claw(Dragons dragon){
        setName("Claw");
        setDragons(dragon);
        setDamageOnLife(40.0);
        setDamageOnSpeed(20.0);
    }

}
