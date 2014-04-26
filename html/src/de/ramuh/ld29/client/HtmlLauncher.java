package de.ramuh.ld29.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

import de.ramuh.ld.main.LD28Game;
import de.ramuh.ld.test.Testlevel;
import de.ramuh.ld29.LD29;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(1280, 720);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return (ApplicationListener) new LD28Game(new Testlevel());
        }
}