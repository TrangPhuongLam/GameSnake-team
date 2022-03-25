package controller;

import java.awt.event.MouseListener;

public interface Controller extends MouseListener {
	public void newGame();

	public void exitGame();

	public void scoreGame();

	public void levelGame();

	public void helpGame();
}
