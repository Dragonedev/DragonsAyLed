package attacks;

import dragons.Dragons;

public class Strike extends Attack {

    public Strike(Dragons dragon){
        setName("Strike");
        setDragons(dragon);
        setDamageOnLife(20.0);
        setDamageOnSpeed(40.0);
    }
}
