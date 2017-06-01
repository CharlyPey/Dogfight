package jpu2016.dogfight.model;

public class Mobile {
	private int			speed;
	private Direction	direction;
	private Position	position;
	private Dimension	dimension;
	private String		image;

	private Mobile( Direction direction, Position position)

}

	public int getHeight() {
		return 1;

	}

	public int getWidht() {
		return 1;
	}

	public void move() {

	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {
		return false;
	}

	public void moveUp() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}

	public Color getColor() {
		return null;

	}

	public IDogfightModel getDogfightModel() {
		return null;

	}

	public void setDogfightModel(IDogfightModel dogfightModel) {
		return null;

	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;

	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}