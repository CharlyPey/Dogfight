package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private int				SPEED				= 4;
	private static int		WIDTH				= 30;		// Largeur
	private static int		HEIGHT				= 10;		// Hauteur
	private static int		MAXDISTANCETRAVELED	= 1400;
	private static String	IMAGE				= "missile";
	private int				distanceTraveled	= 0;

	public Missile(final Direction direction, final Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), MAXDISTANCETRAVELED, IMAGE);
	}

	public int getWidthWithADirection(final Direction direction) {
		switch (direction) {
		case UP:
		case DOWN:
			WIDTH = 10;
			break;
		case RIGHT:
		case LEFT:

			break;
		}
		return WIDTH;
	}

	@Override
	public boolean hit() {
		return true;
	}

	public int getHeightWithADirection(final Direction direction) {
		switch (direction) {
		case UP:
		case DOWN:
			HEIGHT = 30;
			break;
		case RIGHT:
		case LEFT:

			break;
		}
		return HEIGHT;
	}

	@Override
	public void move() {
		while (this.distanceTraveled < MAXDISTANCETRAVELED) {
			this.distanceTraveled = this.distanceTraveled + this.SPEED;
		}
		this.getDogfightModel().removeMobile(this);

	}

	@Override
	public boolean isWeapon() {
		return true;
	}
}
