package jpu2016.dogfight.model;

public class Position {
	private double	x;
	private double	y;
	private double	maxX;
	private double	maxY;

	public Position(double x, double y, double maxX, double maxY) {
		this.x = x;
		this.y = y;
		this.maxX = maxY;
		this.maxY = maxY;

	}

	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;

	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = (x + this.maxX) % this.maxX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = (y + this.maxY) % this.maxY;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
