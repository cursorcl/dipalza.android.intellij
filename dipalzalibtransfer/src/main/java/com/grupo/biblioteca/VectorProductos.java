package com.grupo.biblioteca;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import com.grupo.basedatos.Producto;

public class VectorProductos extends VectorDatosBasicos<Producto>{

	@Override
	public void decode(DataInputStream inputStream) {
	    try
	    {
	      int size = inputStream.readInt();
	      vector = new Vector<Producto>(size);
	      for (int n = 0; n < size; ++n) {
	        Producto p = new Producto();
	        p.decode(inputStream);
	        vector.addElement(p);
	      }
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
		
	}

}
