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

	public void buildArea(Dimension dimension) {

	}

	@Override
	public void addMobile(IMobile mobile) {

	}

	public void removeMobile(IMobile mobile) {

	}

	public ArrayList<IMobile> getMobile() {
		return null;

	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}

	public void setMibilesHavesMoved() {

	}

	@Override
	public void buildArea(java.awt.Dimension aDimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(DogfightModel.jpu2016.dogfight.model.IMobile aMobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<DogfightModel.jpu2016.dogfight.model.IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(Dogfight_Model.jpu2016.dogfight.model.IMobile aMobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Dogfight_Model.jpu2016.dogfight.model.IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}
}
