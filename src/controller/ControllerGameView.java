package controller;

import java.awt.event.KeyEvent;

import model.ModelGameView;
import view.GameView;

public class ControllerGameView {

	private ModelGameView modelGameView;
	private GameView game;

	public ControllerGameView(GameView gameView) {
		this.game = gameView;
		modelGameView = new ModelGameView(gameView);
	}

	public void handlerKeyPress(KeyEvent e) {
		modelGameView.handlerKeyPress(e);
	}

	public void handlerScore() {
		modelGameView.handlerScore();
	}

}
