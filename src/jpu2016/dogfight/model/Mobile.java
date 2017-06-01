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

	}

	public int getWidht() {

	}

	public void move() {

	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {

	}

	public void moveUp() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}

	public Color getColor() {

	}

	public Dogfight Model.

	jpu2016.dogfight.model.IDogfightModel getDogfightModel() {

	}

	public void setDogfightModel(Dogfight Model.jpu2016.dogfight.model.IDogfightModel dogfightModel) {

	}

	public boolean hit() {

	}

	public boolean isWeapon() {

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