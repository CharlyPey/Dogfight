package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	public EventPerformer(final IOrderPerformer orderPerformer) {

	}

	public void eventPerform(final KeyEvent keyCode) {

	}

	private UserOrder keyCodeToUserOrder(final int keyCode) {
		return null;
	}
}
