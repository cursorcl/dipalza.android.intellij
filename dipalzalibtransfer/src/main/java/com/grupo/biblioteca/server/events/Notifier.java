package com.grupo.biblioteca.server.events;

import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

public abstract class Notifier {

	private List<Notificable> notificables;

	public Notifier() {
		this.notificables = new LinkedList<Notificable>();
	}

	public synchronized void addNotificable(Notificable notificable) {
		this.notificables.add(notificable);
	}

	public synchronized void removeNotificable(Notificable notificable) {
		int idx = this.notificables.indexOf(notificable);
		if (idx != -1)
		{
			this.notificables.remove(idx);
		}
	}

	public synchronized void notify(EventObject event) {
		for (int n = 0; n < this.notificables.size(); ++n)
		{
			this.notificables.get(n).handle(event);
		}
	}
	

}