package attacks;

import dragons.Dragons;

public abstract class Attack {
    private String name;
    private Double damageOnLife;
    private Double damageOnSpeed;

    private Dragons dragons;

    public void applyDamageOnLife(Dragons enemyDragon) {
        double life = enemyDragon.getLife() - damageOnLife;

        enemyDragon.setLife(Math.max(0, life));

    }

    public void applyDamageOnSpeed(Dragons enemyDragon) {
        double speed = enemyDragon.getSpeed() - damageOnSpeed;

        enemyDragon.setSpeed(Math.max(0, speed));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDamageOnLife() {
        return damageOnLife;
    }

    public void setDamageOnLife(Double damageOnLife) {
        this.damageOnLife = damageOnLife;
    }

    public Double getDamageOnSpeed() {
        return damageOnSpeed;
    }

    public void setDamageOnSpeed(Double damageOnSpeed) {
        this.damageOnSpeed = damageOnSpeed;
    }

    public Dragons getDragons() {
        return dragons;
    }

    public void setDragons(Dragons dragons) {
        this.dragons = dragons;
    }
}
