package de.ramuh.game.engine.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import de.ramuh.game.engine.Engine;
import de.ramuh.game.engine.scene.Constants;

public class DebugInputHandler extends InputHandler {
	
	@Override
	public boolean keyDown(int k) {
		// DEBUG CODE
		if (Constants.DEBUG) {
			System.out.println("Keydown " + k);
			if (k == Input.Keys.F5) {
				System.out.println("Resizing to 1080p");
				Engine.resizeWindow(1920, 1080);
			}

			if (k == Input.Keys.F6) {
				System.out.println("Resizing to 720");
				Engine.resizeWindow(1280, 720);
			}

			if (k == Input.Keys.Q) {
				System.out.println("Quit");
				Gdx.app.exit();
			}
		}
		return false;
	}
}
