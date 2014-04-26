package de.ramuh.ld29.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.ramuh.game.engine.Engine;
import de.ramuh.ld.main.LD28Game;
import de.ramuh.ld.test.Testlevel;
import de.ramuh.ld29.LD29;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "archery";
		cfg.width = 1280;
		cfg.height = 720;
		cfg.vSyncEnabled = false;
		
		new LwjglApplication(new LD28Game(new Testlevel()), cfg);
	}
}
