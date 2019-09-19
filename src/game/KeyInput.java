package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

  private Handler handler;

  public KeyInput(Handler handler) {
    this.handler = handler;
  }
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    for (int i = 0; i < handler.element.tiles.size(); i++) {
      Tile tempObject = handler.element.tiles.get(i);

      if (tempObject.getId() == ID.Player) {
//        if (key == KeyEvent.VK_UP) {
//          tempObject.setVelY(-tempObject.getSpeed());
//        }
//        if (key == KeyEvent.VK_DOWN) {
//          tempObject.setVelY(tempObject.getSpeed());
//        }
        if (key == KeyEvent.VK_LEFT) {
          tempObject.setVelX(-tempObject.getSpeed());
        }
        if (key == KeyEvent.VK_RIGHT) {
          tempObject.setVelX(tempObject.getSpeed());
        }
      }
    }
  }

  public void keyReleased(KeyEvent e) {
    int key = e.getKeyCode();
    for (int i = 0; i < handler.element.tiles.size(); i++) {
      Tile tempObject = handler.element.tiles.get(i);

      if (tempObject.getId() == ID.Player) {
//                if (key == KeyEvent.VK_UP) tempObject.setVelY(0);
//                if (key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
//                if (key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
//                if (key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
      }
    }
  }

}
