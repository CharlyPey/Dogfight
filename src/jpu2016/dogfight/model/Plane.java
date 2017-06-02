package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private int	SPEED	= 2;
	private int	WIDTH	= 100;
	private int	HEIGHT	= 30;
	private int	player;

	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, this.dimension, player, image);
		this.player = player;
		this.direction = direction;
		this.position = position;
		this.image = image;

	}

	@Override
	public boolean isPlayer(int player) {
		return false;
	}

	@Override
	public boolean hit() {
		return false;
	}

}
