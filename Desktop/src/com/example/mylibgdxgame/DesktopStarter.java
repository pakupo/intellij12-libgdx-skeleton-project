package com.example.mylibgdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopStarter {
    public static void main( String[] args ) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Title";
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication( new MyLibgdxGame(), cfg );
    }
}
