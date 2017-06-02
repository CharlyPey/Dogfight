package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Point;

import com.sun.prism.Image;

public class Mobile implements IMobile {
	private int			speed;
	protected Direction	direction;
	private Position	position;
	private Dimension	dimension;
	private Image		image;

	private Mobile(Direction direction, Position position, Dimension dimension, int speed, Image image) {
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;

	}

	@Override
	public int getHeight() {
		return 1;

	}

	public int getWidht() {
		return 1;
	}

	@Override
	public void move() {

	}

	@Override
	public void placeInArea(IArea area) {

	}

	@Override
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

	}

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isWeapon() {
		return false;

	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public Image getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public void setDirection() {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDogfightModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

}