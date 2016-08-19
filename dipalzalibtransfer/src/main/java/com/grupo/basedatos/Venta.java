package com.grupo.basedatos;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import com.grupo.basedatos.itfz.ADatosBasicos;
import com.grupo.utilitarios.FechaFormateada;

public class Venta extends ADatosBasicos {

	/**
	 * @uml.property  name="encabezado"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private EncabezadoVenta encabezado;
	/**
	 * @uml.property  name="ventas"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ItemesVenta ventas;
	/**
	 * @uml.property  name="fecha"
	 * @uml.associationEnd  
	 */
	private FechaFormateada fecha;
	
	public Venta() {
		encabezado = new EncabezadoVenta();
		ventas = new ItemesVenta();
	}
	
	
	
	public Venta(EncabezadoVenta encabezado, ItemesVenta ventas,
			FechaFormateada fecha) {
		super();
		this.encabezado = encabezado;
		this.ventas = ventas;
		this.fecha = fecha;
	}



	/**
	 * @return
	 * @uml.property  name="encabezado"
	 */
	public EncabezadoVenta getEncabezado() {
		return encabezado;
	}
	/**
	 * @param encabezado
	 * @uml.property  name="encabezado"
	 */
	public void setEncabezado(EncabezadoVenta encabezado) {
		this.encabezado = encabezado;
	}
	/**
	 * @return
	 * @uml.property  name="ventas"
	 */
	public ItemesVenta getVentas() {
		return ventas;
	}
	/**
	 * @param ventas
	 * @uml.property  name="ventas"
	 */
	public void setVentas(ItemesVenta ventas) {
		this.ventas = ventas;
	}
	@Override
	public void decode(DataInputStream inputStream) {
		encabezado.decode(inputStream);
		ventas.decode(inputStream);
	}

	@Override
	public byte[] encode() {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    DataOutputStream outputStream = new DataOutputStream(baos);
	    try {
	      outputStream.write(encabezado.encode());
	      outputStream.write(ventas.encode());
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	    byte[] buffer = baos.toByteArray();
	    return buffer;
	}

	/**
	 * @param fecha
	 * @uml.property  name="fecha"
	 */
	public void setFecha(FechaFormateada fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return
	 * @uml.property  name="fecha"
	 */
	public FechaFormateada getFecha() {
		return fecha;
	}
	
	

}
