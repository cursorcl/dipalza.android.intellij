package com.grupo.biblioteca;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import com.grupo.basedatos.itfz.ADatosBasicos;

public abstract class VectorDatosBasicos<T extends ADatosBasicos> extends ADatosBasicos {

	/**
	 * @uml.property  name="vector"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.grupo.basedatos.itfz.ADatosBasicos"
	 */
	Vector<T> vector;

	public VectorDatosBasicos() {
		vector = new Vector<T>();
	}
	
	public void add(T value) {
		vector.add(value);
	}
	
	public void remove(T value) {
		vector.remove(value);
	}
	
	public void remove(int index) {
		vector.remove(index);
	}
	
	public int size() {
		return vector.size();
	}
	
	public T elementAt(int index) {
		return vector.elementAt(index);
	}
	
	public Vector<T> asVector() {
		return vector;
	}
	
	@Override
	public byte[] encode() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream outputStream = new DataOutputStream(baos);
		try {
			outputStream.writeInt(vector.size());
			for(T t: vector) {
				outputStream.write(t.encode());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		byte[] buffer = baos.toByteArray();
		return buffer;	
	}

	

}
