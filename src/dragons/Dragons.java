package dragons;

import Powers.enums.PowerType;
import skins.Skin;

public abstract class Dragons {
    private String name;
    private Double life;
    private Double speed;
    private Skin skin;
    private PowerType power;

    public Dragons(){
    }

    public Dragons(String name, Double life, Double speed, Skin skin, PowerType power){
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.skin = skin;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLife() {
        return life;
    }

    public void setLife(Double life) {
        this.life = life;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public PowerType getPower() {
        return power;
    }

    public void setPower(PowerType power) {
        this.power = power;
    }
}
