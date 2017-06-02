package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable {

	private final EventPerformer	eventPerformer;
	private final GraphicsBuilder	graphicsBuilder;
	private final GameFrame			gameFrame;

	public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel,
			final Observable observable) {
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.gameFrame = new GameFrame();
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
