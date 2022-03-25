package model;

public class SpeedFactory {
	public static Speed getSpeed(SpeedDescription description) {
		Level level = new Level();
		Speed speed = new EasySpeed(level);
		switch(description) {
		case EASY:
			break;
		case NORMAL:
			speed = new NormalSpeed(level);
		case HARD:
			speed = new HighSpeed(level);
			
		}
		return speed;
		
	}

}
