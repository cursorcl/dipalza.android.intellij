package com.grupo.basedatos;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import com.grupo.basedatos.itfz.ADatosBasicos;

public class NroItemesVenta extends ADatosBasicos {

	/**
	 * @uml.property  name="nroItemesVenta"
	 */
	private int nroItemesVenta;

	public NroItemesVenta() {
	}

	public NroItemesVenta(int nroItemesVenta) {
		this.nroItemesVenta = nroItemesVenta;
	}

	/**
	 * @return
	 * @uml.property  name="nroItemesVenta"
	 */
	public int getNroItemesVenta() {
		return this.nroItemesVenta;
	}

	/**
	 * @param nroItemesVenta
	 * @uml.property  name="nroItemesVenta"
	 */
	public void setNroItemesVenta(int nroItemesVenta) {
		this.nroItemesVenta = nroItemesVenta;
	}

	public void decode(DataInputStream inputStream) {
		try {
			setNroItemesVenta(inputStream.readShort());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public byte[] encode() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream outputStream = new DataOutputStream(baos);
		try {
			outputStream.writeShort(getNroItemesVenta());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		byte[] buffer = baos.toByteArray();
		return buffer;
	}

}