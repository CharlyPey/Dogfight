package jpu2016.dogfight.model;

public class Missile {
	private int		SPEED				= 4;
	private int		WIDTH				= 30;
	private int		MAXDISTANCETRAVELED	= 1400;
	private String	IMAGE				= "missile";
	private int		distanceTraveled	= 0;

	public Missile(Direction direction, Dimension dimension) {

	}

	public int getWidthWithADirection(Direction direction) {
		return 1;
	}

	public int getHeightWithADirection(Direction direction) {
		return 1;
	}

	public void move() {

	}

	public boolean isWeapon() {
		return false;
	}
}
