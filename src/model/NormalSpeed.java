package model;

public class NormalSpeed implements Speed{
	private Level level;
	
	public NormalSpeed(Level level) {
		this.level = level;
	}
	
	@Override
	public void setSpeed() {
		level.setSpeedGame(200);	
	}

}
