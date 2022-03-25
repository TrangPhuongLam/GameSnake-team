package controller;

import java.awt.Graphics;

import model.Data;
import model.ModelScreenGame;
import view.ScreenGame;

public class ControllerScreenGame {
	
	private ModelScreenGame model;

	public ControllerScreenGame(ScreenGame screenGame) {
		init();
		model = new ModelScreenGame(screenGame);
	}
	
	public void init() {
		Data.loadImage();
		Data.loadAnimation();
	}
	
	public int sizeFrame() {
		return model.sizeFrame();
	}

	public void paint(Graphics g) {
		model.paint(g);
	}

	public void handleState() {
		model.state();
	}

}
