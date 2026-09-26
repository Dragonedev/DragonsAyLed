package player;


import dragons.Dragons;

public class Player {

    private String nick;
    private Dragons dragon;

    public Player(String nick, Dragons dragon) {
        this.nick = nick;
        this.dragon = dragon;
    }

    public String getNick() {
        return nick;
    }

    public Dragons getDragon() {
        return dragon;
    }
}

