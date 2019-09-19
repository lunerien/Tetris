package game;

import java.awt.*;

class Tile {

  private int x, y;
  private ID id;
  private int velX, velY;
  private int speed;
  private int delayD;
  private int startDelayD;
  private int delayRL;
  private int startDelayRL;
  private int size;
  private boolean collide;
  private Field field;

  Tile(int x, int y, int speed, ID id, int delayD, int delayRL, int size, Field field) {
    this.x = x;
    this.y = y;
    this.id = id;
    this.delayD = 0;
    this.startDelayD = delayD;
    this.delayRL = 0;
    this.startDelayRL = delayRL;
    this.speed = speed;
    this.size = size;
    this.collide = false;
    this.field = field;
  }

  void tick() {
    if (!collide) {
      if (delayRL == 0) {
        x += velX;
        velX = 0;
        delayRL = startDelayRL;
      } else {
        delayRL--;
      }

      if (delayD == 0) {
        y += speed;
        delayD = startDelayD;
      } else {
        delayD--;
      }
    }

    //TODO add collisions
    //TODO add field borders
  }

  void render(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(x, y, size, size);
  }

  public int getVelX() {
    return velX;
  }

  public void setVelX(int velX) {
    this.velX = velX;
  }

  public int getVelY() {
    return velY;
  }

  public void setVelY(int velY) {
    this.velY = velY;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public ID getId() {
    return id;
  }

  public void setId(ID id) {
    this.id = id;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public boolean isCollide() {
    return collide;
  }

  public void setCollide(boolean collide) {
    this.collide = collide;
  }
}
