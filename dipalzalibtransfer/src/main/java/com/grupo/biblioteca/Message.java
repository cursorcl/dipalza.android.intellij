package com.grupo.biblioteca;

import java.util.Vector;

import com.grupo.basedatos.IdentificacionPalm;

public class Message {
	/**
	 * @uml.property  name="tipoMessage"
	 */
	private byte tipoMessage;
	/**
	 * @uml.property  name="messages"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="B"
	 */
	private Vector Messages = null;
	/**
	 * @uml.property  name="idPalm"
	 * @uml.associationEnd  
	 */
	private IdentificacionPalm idPalm;

	public Message() {
		Messages = new Vector();
	}

	/**
	 * @return  Returns the tipoMessage.
	 * @uml.property  name="tipoMessage"
	 */
	public byte getTipoMessage() {
		return tipoMessage;
	}

	/**
	 * @param tipoMessage  The tipoMessage to set.
	 * @uml.property  name="tipoMessage"
	 */
	public void setTipoMessage(byte tipoMessage) {
		this.tipoMessage = tipoMessage;
	}

	/**
	 * @return  Returns the messages.
	 * @uml.property  name="messages"
	 */
	public Vector getMessages() {
		return Messages;
	}

	public void addData(byte[] data) {

		Messages.addElement(data);

	}

	public void clear() {
		Messages.removeAllElements();
	}

	/**
	 * @return  Returns the idPalm.
	 * @uml.property  name="idPalm"
	 */
	public IdentificacionPalm getIdPalm() {
		return idPalm;
	}

	/**
	 * @param idPalm  The idPalm to set.
	 * @uml.property  name="idPalm"
	 */
	public void setIdPalm(IdentificacionPalm idPalm) {
		this.idPalm = idPalm;
	}

}
