package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private ArrayList<IMobile>	mobiles;
	private Sky					sky;

	public DogfightModel() {
		Dimension DimSky;
		DimSky = new Dimension(50, 50);
		this.sky = new Sky(DimSky);
		ArrayList<IMobile> mobiles = new ArrayList<IMobile>();
		mobiles.add(new Plane(1, Direction.LEFT, new Position(5, 5, 30, 50), "F4U_LEFT"));
	}

	@Override
	public IArea getArea() {
		return null;
	}

	@Override
	public void addMobile(IMobile mobile) {

	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}

	@Override
	public void buildArea(java.awt.Dimension aDimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(IMobile mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
