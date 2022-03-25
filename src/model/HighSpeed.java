package model;

public class HighSpeed implements Speed{
	private Level level;
	
	public HighSpeed(Level level) {
		this.level = level;
	}
	@Override
	public void setSpeed() {
		level.setSpeedGame(100);		
	}
}
