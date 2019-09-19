package game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Field {

  LinkedList<Tile> ElementsInField = new LinkedList<Tile>();
  int WIDTH;
  int HEIGHT;

  public Field(int WIDTH, int HEIGHT) {
    this.HEIGHT = HEIGHT;
    this.WIDTH = WIDTH;
  }

  public int getWIDTH() {
    return WIDTH;
  }

  public void setWIDTH(int WIDTH) {
    this.WIDTH = WIDTH;
  }

  public int getHEIGHT() {
    return HEIGHT;
  }

  public void setHEIGHT(int HEIGHT) {
    this.HEIGHT = HEIGHT;
  }

  public void addElement(Tile tile) {
    tile.setId(ID.Element);
    tile.setSpeed(0);
    ElementsInField.add(tile);
  }

  public void tick() {
    //TODO check if row is full
    //TODO add points
    //TODO implement end of game
  }

  public void render(Graphics g) {
    for (Tile tempTile : ElementsInField) {
      tempTile.render(g);
    }
  }
}
