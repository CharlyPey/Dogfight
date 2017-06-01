package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;

import Dogfight_Model.IArea;
//import jpu2016.dogfight.model.IMobile;
//import Dogfight_Model.jpu2016.dogfight.model.IMobile;

public interface IDogfightModel {
	public IArea getArea();

	public void buildArea(Dimension aDimension);

	public void addMobile(jpu2016.dogfight.model.IMobile aMobile);

	public void removeMobile(Dogfight_Model.jpu2016.dogfight.model.IMobile aMobile);

	public ArrayList<Dogfight_Model.jpu2016.dogfight.model.IMobile> getMobiles();

	public jpu2016.dogfight.model.IMobile getMobileByPlayer(int aPlayer);

	public void setMobilesHavesMoved();
}
