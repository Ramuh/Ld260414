package de.ramuh.ld.test;


import com.badlogic.gdx.graphics.Texture;

import de.ramuh.game.engine.scene.templates.RPGBattleScene;
import de.ramuh.game.engine.scene.templates.SideScrollerScene;
import de.ramuh.ld.test.Selector;

public class Testlevel extends RPGBattleScene {

	public Testlevel() {
		super.menuFileName = "data/maps/menu1.tmx";
		super.mapFileName = "data/maps/test1.tmx";
	}
	
	@Override
	public void init() {
		super.init();
		am.load("data/art/tilesets/rpg1.png", Texture.class);
		
		am.finishLoading();
	}
	
}
