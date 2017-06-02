package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private final int				TIME_SLEEP	= 30;
	private final IDogfightModel	dogfightModel;
	private IViewSystem				viewSystem;

	public DogfightController(final IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(final IViewSystem viewSystem) {
	}

	public void lauchMissile(final int player) {
	}

	public void gameLoop() {

	}

}
