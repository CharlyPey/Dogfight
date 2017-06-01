package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016_dogfight.Control.IOrderPerformer;

public class DogfightView implements IViewSystem, Runnable {

	public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel,
			final Observable observable) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayMessage(final String message) {

	}

	@Override
	public void closeAll() {

	}
}
