package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	private final IOrderPerformer	orderPerformer;
	private UserOrder				userOrder;

	public EventPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		// this.userOrder = new UserOrder(0, null);
	}

	@Override
	public void eventPerform(final KeyEvent keyCode) {
		this.keyCodeToUserOrder(keyCode.getKeyCode());
	}

	private UserOrder keyCodeToUserOrder(final int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_UP:
			this.orderPerformer.orderPerform(new UserOrder(0, Order.UP));
			break;
		case KeyEvent.VK_DOWN:
			this.orderPerformer.orderPerform(new UserOrder(0, Order.DOWN));
			break;
		case KeyEvent.VK_LEFT:
			this.orderPerformer.orderPerform(new UserOrder(0, Order.LEFT));
			break;
		case KeyEvent.VK_RIGHT:
			this.orderPerformer.orderPerform(new UserOrder(0, Order.RIGHT));
			break;
		case KeyEvent.VK_SPACE:
			this.orderPerformer.orderPerform(new UserOrder(0, Order.SHOOT));
			break;
		}
		return null;
	}
}
