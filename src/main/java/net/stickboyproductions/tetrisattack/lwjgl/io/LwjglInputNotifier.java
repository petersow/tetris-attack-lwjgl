package net.stickboyproductions.tetrisattack.lwjgl.io;

import net.stickboyproductions.tetrisattack.constants.Controls;
import net.stickboyproductions.tetrisattack.io.InputController;
import net.stickboyproductions.tetrisattack.io.InputNotifier;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import javax.inject.Inject;

/**
 * User: Pete
 * Date: 27/10/12
 * Time: 17:25
 */
public class LwjglInputNotifier implements InputNotifier {

  public void pollInput(InputController inputController) {
    if (Mouse.isButtonDown(0)) {
      int x = Mouse.getX();
      int y = Mouse.getY();
    }
    while (Keyboard.next()) {
      if (Keyboard.getEventKeyState()) {
        if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
          inputController.createAction(Controls.LEFT, Controls.LEFT_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
          inputController.createAction(Controls.RIGHT, Controls.RIGHT_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
          inputController.createAction(Controls.UP, Controls.UP_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
          inputController.createAction(Controls.DOWN, Controls.DOWN_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_X) {
          inputController.createAction(Controls.BLOCK_SWAP, Controls.BLOCK_SWAP_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_P) {
          inputController.createAction(Controls.PAUSE, Controls.PAUSE_SPAMMABLE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_SPACE) {
          inputController.createAction(Controls.NEW_LINE, Controls.NEW_LINE_SPAMMABLE);
        }
      } else {
        if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
          inputController.removeAction(Controls.LEFT);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
          inputController.removeAction(Controls.RIGHT);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
          inputController.removeAction(Controls.UP);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
          inputController.removeAction(Controls.DOWN);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_X) {
          inputController.removeAction(Controls.BLOCK_SWAP);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_P) {
          inputController.removeAction(Controls.PAUSE);
        }
        if (Keyboard.getEventKey() == Keyboard.KEY_SPACE) {
          inputController.removeAction(Controls.NEW_LINE);
        }
      }
    }
  }
}
