package models;

//Clase Abstracta, no creo un enemigo directamente sino que lo uso para crear otros enemigos.
public abstract class Enemy {
    protected Double health;
    protected Integer posX;
    protected Integer PosY;

    public Enemy(Double health, Integer posX, Integer posY) {
        this.health = health;
        this.posX = posX;
        PosY = posY;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return PosY;
    }

    public void setPosY(Integer posY) {
        PosY = posY;
    }
}
