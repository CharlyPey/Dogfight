package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.gameframe.IEventPerformer;
import jpu2016_dogfight.Control.IOrderPerformer;
import jpu2016_dogfight.Control.UserOrder;

public class EventPerformer implements IEventPerformer {
	public EventPerformer(final IOrderPerformer orderPerformer) {

	}

	public void eventPerform(final KeyEvent keyCode) {

	}

	private UserOrder keyCodeToUserOrder(final int keyCode) {
		return null;
	}
}