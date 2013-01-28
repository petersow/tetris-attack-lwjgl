package net.stickboyproductions.tetrisattack.lwjgl.di;

import com.google.inject.AbstractModule;
import net.stickboyproductions.tetrisattack.di.GameModule;
import net.stickboyproductions.tetrisattack.io.InputNotifier;
import net.stickboyproductions.tetrisattack.lwjgl.io.LwjglInputNotifier;
import net.stickboyproductions.tetrisattack.lwjgl.ui.LwjglScreen;
import net.stickboyproductions.tetrisattack.ui.Screen;

/**
 * User: Pete
 * Date: 28/01/13
 * Time: 21:17
 */
public class LwjglGameModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new GameModule());
    bind(Screen.class).to(LwjglScreen.class);
    bind(InputNotifier.class).to(LwjglInputNotifier.class);
  }
}
