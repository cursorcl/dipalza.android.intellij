package com.grupo.biblioteca;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import com.grupo.basedatos.Cliente;

public class VectorClientes extends VectorDatosBasicos<Cliente> {

	@Override
	public void decode(DataInputStream inputStream) {
		try {
			int size = inputStream.readInt();
			vector = new Vector<Cliente>(size);
			for (int n = 0; n < size; ++n) {
				Cliente c = new Cliente();
				c.decode(inputStream);
				vector.addElement(c);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
