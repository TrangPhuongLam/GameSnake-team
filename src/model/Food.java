package model;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Food {
	protected PaintStrategy paintStrategy;
	protected RandomFoodStrategy foodStrategy;
	
	public abstract Point randomFood();
	public abstract void paint(Graphics g);
}
