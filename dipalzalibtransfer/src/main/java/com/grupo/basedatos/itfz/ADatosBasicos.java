package com.grupo.basedatos.itfz;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import com.grupo.biblioteca.DatosBasicos;

public abstract class ADatosBasicos implements DatosBasicos {
	
	public void decode(byte[] buffer) {
		ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
		DataInputStream inputStream = new DataInputStream(bais);
		decode(inputStream);
	}

	
	public abstract void decode(DataInputStream inputStream);
	

	
	public byte[] encode() {
		return null;
	}
}
