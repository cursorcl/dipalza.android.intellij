package com.grupo.biblioteca.server.events;

import com.grupo.biblioteca.DatosBasicos;
import com.grupo.biblioteca.EMessagesTypes;
import java.util.EventObject;

public class MessagesClientEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="command"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private EMessagesTypes command;
	/**
	 * @uml.property  name="data"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private DatosBasicos data;

	public MessagesClientEvent(EMessagesTypes command, DatosBasicos source) {
		super(source);
		this.command = command;
		this.data = source;
	}

	public MessagesClientEvent(EMessagesTypes command) {
		this(command, null);
	}

	/**
	 * @return
	 * @uml.property  name="command"
	 */
	public EMessagesTypes getCommand() {
		return this.command;
	}

	/**
	 * @param command
	 * @uml.property  name="command"
	 */
	public void setCommand(EMessagesTypes command) {
		this.command = command;
	}

	/**
	 * @return
	 * @uml.property  name="data"
	 */
	public DatosBasicos getData() {
		return this.data;
	}

	/**
	 * @param data
	 * @uml.property  name="data"
	 */
	public void setData(DatosBasicos data) {
		this.data = data;
	}

}