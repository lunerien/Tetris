package game;

import java.awt.*;

public class Handler {

  private Field field;
  Element element;

  Handler(Field field, int startPosition, int tileSize) {
    this.field = field;
    this.element = new Element(startPosition, tileSize, field);
  }

  void tick() {
    field.tick();
    element.tick();
    }

  void render(Graphics g) {
    field.render(g);
    element.render(g);
    }

}
