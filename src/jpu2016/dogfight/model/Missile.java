package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private final static int	SPEED				= 4;
	private final static int	WIDTH				= 30;
	private final static int	HEIGHT				= 10;
	private final static int	MAXDISTANCETRAVELED	= 1400;
	private final static String	IMAGE				= "missile";
	private final int			distanceTraveled	= 0;

	public Missile(final Direction direction, final Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), MAXDISTANCETRAVELED, IMAGE);
		this.direction = direction;
	}

	public int getWidthWithADirection(final Direction direction) {
		return 1;
	}

	public int getHeightWithADirection(final Direction direction) {
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
