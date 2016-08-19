package com.grupo.biblioteca;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import com.grupo.basedatos.Venta;

public class VectorVenta extends VectorDatosBasicos<Venta>{

	@Override
	public void decode(DataInputStream inputStream) {
	    try
	    {
	      int size = inputStream.readInt();
	      vector = new Vector<Venta>(size);
	      for (int n = 0; n < size; ++n) {
	        Venta v = new Venta();
	        v.decode(inputStream);
	        vector.addElement(v);
	      }
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
		
	}

}
