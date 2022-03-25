package model;

import java.awt.Color;
import java.awt.Graphics;

import view.ScreenGame;

public class Snake {
	private Direction direction;
	private int[] x;
	private int[] y;
	private int length;
	private int vector;
	long t1;
//	private Food food;
	static boolean udAfterChangeVt = true;
	static int score;
	private HighScore highScore;
	private GameState state;
	static Score score2;
	private Level level;
	static int speed;
	static int maxLength = 10;
	static int level1;

	public Snake() {

		highScore = HighScore.getInstance();
		state = new GameState();
		score = 0;
		score2 = new Score();
		level = new Level();
		level1 = level.getNumberLevel();
		speed = level.getSpeed();

		// chieu dai toi da cua con ran la 100
		x = new int[100];
		y = new int[100];

		x[0] = 7;
		y[0] = 11;
		x[1] = 7;
		y[1] = 12;
		x[2] = 7;
		y[2] = 13;

		length = 3;// do dai ran ban dau bang 3

		vector = direction.GO_UP; // xac dinh huong di ban dau cua ran la di len

	}

	public void resetGame(int n) {
		x = new int[100];
		y = new int[100];

		x[0] = 5;
		y[0] = 11;
		x[1] = 6;
		y[1] = 11;
		x[2] = 7;
		y[2] = 11;

		length = 3;

		vector = direction.GO_LEFT;
		level.setNumberLevel(n);
		level.setSpeedWithLevel();
		speed = level.getSpeed();
		level1 = level.getNumberLevel();
		maxLength += 5;

	}

	public int getX() {
		return x[0];
	}

	public int getY() {
		return y[0];
	}

	public void setX(int index) {
		x[0] = index;
	}

	public void setY(int index) {
		y[0] = index;
	}

	public int[] getArrX() {
		return x;
	}

	public int[] getArrY() {
		return y;
	}

	public int getLength() {
		return length;
	}

	public void setVector(int v) {
		if (vector != -v && udAfterChangeVt) {
			vector = v;
			udAfterChangeVt = false;
		}

	}

	public boolean checkVitriDuoi_CungX() {
		for (int i = 0; i < length; i++) {
			if (x[length - 1] == x[length - 2]) {
				return true;
			}
		}
		return false;
	}

	public boolean checkVitriDuoi_CungY() {
		for (int i = 0; i < length; i++) {
			if (y[length - 1] == y[length - 2]) {
				return true;
			}
		}
		return false;
	}

	public boolean cungX(int j) {
		for (int i = 0; i < length; i++) {
			if (x[i] == j) {
				return true;
			}
		}
		return false;
	}

	public boolean cungY(int j) {
		for (int i = 0; i < length; i++) {
			if (y[i] == j) {
				return true;
			}

		}
		return false;
	}

	public void paint(Graphics g) {
		g.setColor(new Color(68, 237, 72));
		for (int i = 1; i < length - 1; i++) {
			g.fillRect(x[i] * 20, y[i] * 20, 20, 20);
		}
		if (vector == direction.GO_UP) {
			g.drawImage(Data.imageHead_Up, x[0] * 20, y[0] * 20, null);
		} else if (vector == direction.GO_DOWN) {
			g.drawImage(Data.imageHead_Down, x[0] * 20, y[0] * 20, null);
		} else if (vector == direction.GO_LEFT) {
			g.drawImage(Data.imageHead_Left, x[0] * 20, y[0] * 20, null);
		} else if (vector == direction.GO_RIGHT) {
			g.drawImage(Data.imageHead_Right, x[0] * 20, y[0] * 20, null);
		}
		for (int i = 0; i < length; i++) {
			if (checkVitriDuoi_CungX()) {
				if (y[length - 2] < y[length - 1]) {
					g.drawImage(Data.imageTail_Down, x[length - 1] * 20, y[length - 1] * 20, null);

				} else if (y[length - 2] > y[length - 1]) {
					g.drawImage(Data.imageTail_Up, x[length - 1] * 20, y[length - 1] * 20, null);
				}
			}
			if (checkVitriDuoi_CungY()) {
				if (x[length - 2] < x[length - 1]) {
					g.drawImage(Data.imageTail_Right, x[length - 1] * 20, y[length - 1] * 20, null);
				} else if (x[length - 2] > x[length - 1]) {
					g.drawImage(Data.imageTail_Left, x[length - 1] * 20, y[length - 1] * 20, null);

				}
			}
		}

	}

	public void update() {

		// khi ran tu cham vao minh se chet
		for (int i = 1; i < length; i++) {
			if (x[0] == x[i] && y[0] == y[i]) {
				state.setPlaying(false);
				state.setIsgameOver(true);
			}
		}
		// khi ran chet se luu diem cua nguoi choi lai
		if (state.getgameOver()) {
			highScore.save(score);
		}

		// khi ran dat doo dai toi da se len lv moi
		if (length == maxLength) {
			resetGame(level1 + 1);
			state.setPlaying(false);
		}

		if (System.currentTimeMillis() - t1 > speed) {
			// cap nhat vi tri ran
			for (int i = length - 1; i > 0; i--) {
				x[i] = x[i - 1];
				y[i] = y[i - 1];

			}
			// khi ran an tao se tao tao moi va tang chieu dai ran
			if (ModelScreenGame.frameGame[x[0]][y[0]] == 2) {
				length++;
				ModelScreenGame.frameGame[x[0]][y[0]] = 0;
				ModelScreenGame.frameGame[ModelScreenGame.apple.randomFood().x][ModelScreenGame.apple
						.randomFood().y] = 2;
				score++;
				score2.setScore(score);
				Sound.playSound("D:\\git\\GameSnake\\src\\data\\eatApple.wav");

			}
			// khi ran an nam se tao nam moi va giam chieu dai ran
			if (ModelScreenGame.frameGame[x[0]][y[0]] == -2) {
				length--;
				ModelScreenGame.frameGame[x[0]][y[0]] = 0;

				ModelScreenGame.frameGame[ModelScreenGame.mushroom.randomFood().x][ModelScreenGame.mushroom
						.randomFood().y] = -2;
				score--;
				score2.setScore(score);
				Sound.playSound("D:\\git\\GameSnake\\src\\data\\eatMushroom.wav");
			}

			// vi tri dau ran di theo huong chi dinh
			if (vector == direction.GO_UP)
				y[0]--;
			if (vector == direction.GO_DOWN)
				y[0]++;
			if (vector == direction.GO_LEFT)
				x[0]--;
			if (vector == direction.GO_RIGHT)
				x[0]++;
			// khi ran cham vao tuong khi o lv3 ran se chet
			if (level.getNumberLevel() == 3) {
				if (x[0] < 0 || y[0] < 0 || x[0] > 19 || y[0] > 19) {
					level.touchTheBorder();

				}
			} else {
				if (x[0] < 0)
					x[0] = 19;
				if (y[0] < 0)
					y[0] = 19;
				if (x[0] > 19)
					x[0] = 0;
				if (y[0] > 19)
					y[0] = 0;
			}

			udAfterChangeVt = true;

			t1 = System.currentTimeMillis();
		}
	}

}
