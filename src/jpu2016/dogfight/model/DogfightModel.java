package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private ArrayList<IMobile> mobiles;

	public DogfightModel() {

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
