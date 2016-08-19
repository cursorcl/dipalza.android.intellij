package com.grupo;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import com.grupo.basedatos.itfz.ADatosBasicos;

public class MsgInformaDatos extends ADatosBasicos {

	/**
	 * @uml.property  name="name"
	 */
	private String name;
	/**
	 * @uml.property  name="cantidad"
	 */
	private int cantidad;
	
	public void decode(DataInputStream inputStream) {
		try {
			setName(inputStream.readUTF());
			setCantidad(inputStream.readInt());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public byte[] encode() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream outputStream = new DataOutputStream(baos);
		try {
			outputStream.writeUTF(getName());
			outputStream.writeInt(cantidad);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		byte[] buffer = baos.toByteArray();
		return buffer;
	}


	/**
	 * @param cantidad
	 * @uml.property  name="cantidad"
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return
	 * @uml.property  name="cantidad"
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param name
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

}
