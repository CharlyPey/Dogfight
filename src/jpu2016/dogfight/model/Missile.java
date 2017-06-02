package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private int		SPEED				= 4;
	private int		WIDTH				= 30;
	private int		MAXDISTANCETRAVELED	= 1400;
	private String	IMAGE				= "missile";
	private int		distanceTraveled	= 0;

	public Missile(Direction direction, Dimension dimension) {
		this.direction = direction;
		this.dimension = dimension;
	}

	public int getWidthWithADirection(Direction direction) {
		return 1;
	}

	public int getHeightWithADirection(Direction direction) {
		return 1;
	}

	@Override
	public void move() {

	}

	@Override
	public boolean isWeapon() {
		return false;
	}
}
