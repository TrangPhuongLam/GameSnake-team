package model;

import java.awt.Graphics;

import view.ScreenGame;

public abstract class PaintStrategy {
	ScreenGame screenGame;
	public PaintStrategy(ScreenGame game) {
		this.screenGame = game;
	}
	public abstract void paint(Graphics g);
}
