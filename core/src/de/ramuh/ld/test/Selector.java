package de.ramuh.ld.test;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

import de.ramuh.game.engine.Engine;
import de.ramuh.game.engine.entity.Entity;

public class Selector extends Entity {

	Texture tx;
	public Selector(AssetManager am) {
		super(am);
		
		tx = am.get("data/art/tilesets/rpg1.png");
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Engine.batch.draw(tx, 0, 0);
	}

}
