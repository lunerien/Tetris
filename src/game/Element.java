package game;

import java.awt.Graphics;
import java.util.ArrayList;

public class Element {

  ArrayList<Tile> tiles = new ArrayList<Tile>();
  private int startPosition;
  private int tileSize;
  private boolean collide;
  private Field field;

  public Element(int startPosition, int tileSize, Field field) {
    this.startPosition = startPosition;
    this.tileSize = tileSize;
    this.collide = false;
    this.field = field;
    generateElement();
  }

  private void generateElement() {
    //TODO add element types
    //TODO add random element selection
    tiles.add(new Tile(startPosition, 0, 30, ID.Player, 15, 3, tileSize, field));
  }

  void tick() {
    if (!collide) {
      for (Tile tempTile : tiles) {
        if (!collide) {
          tempTile.tick();
          if (tempTile.isCollide()) {
            collide = true;
          }
        }
      }
    } else {
      sendToField();
      generateElement();
      collide = false;
    }
  }

  private void sendToField() {
    for (Tile tempTile : tiles) {
      field.addElement(tempTile);
      tiles.remove(tempTile);
    }
  }

  void render(Graphics g) {
    for (Tile tempTile : tiles) {
      tempTile.render(g);
    }
  }
}
