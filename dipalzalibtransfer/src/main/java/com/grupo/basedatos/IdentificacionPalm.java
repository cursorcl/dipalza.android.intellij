package com.grupo.basedatos;



import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.grupo.exception.DiaSemanaInvalido;

public class IdentificacionPalm {
	/**
	 * @uml.property  name="idPalm"
	 */
	private String idPalm;
	/**
	 * @uml.property  name="idRuta"
	 */
	private String idRuta;
	/**
	 * @uml.property  name="idRutaAdicional"
	 */
	private String idRutaAdicional;
	
	public IdentificacionPalm() {
		this("000");
	}
	
	public IdentificacionPalm(String idVendedor) {
		this(idVendedor, "000");
	}
	
	public IdentificacionPalm(String idVendedor, String idRuta) {
		this(idVendedor, idRuta, "000");
	}
	
	public IdentificacionPalm(String idVendedor, String idRuta, String idRutaAdicional) {
		idPalm = idVendedor;
		this.idRuta =  idRuta;
		this.idRutaAdicional = idRutaAdicional;
	}
	
	public IdentificacionPalm(DatosInicializacion init) {
		this();
		actualizar(init, new Date());
	}
	
	public IdentificacionPalm(DatosInicializacion init, Date date) {
		this();
		actualizar(init, date);
	}

	private void actualizar(DatosInicializacion init, Date date) {
		if(init != null) {
			idPalm = init.getVendedor();
						
			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
			c.setTime(date);
			int r = c.get(Calendar.DAY_OF_WEEK);
			r = (r == 0) ? 7 : r;
			
			try {
				idRuta =  init.getRuta(r);
				idRutaAdicional = "000";
			} catch (DiaSemanaInvalido e) {
				idRuta = "000";
			}
		}		
	}

	/**
	 * @return
	 * @uml.property  name="idPalm"
	 */
	public String getIdPalm() {
		return idPalm;
	}

	/**
	 * @param idPalm
	 * @uml.property  name="idPalm"
	 */
	public void setIdPalm(String idPalm) {
		this.idPalm = idPalm;
	}

	/**
	 * @return
	 * @uml.property  name="idRuta"
	 */
	public String getIdRuta() {
		return idRuta;
	}

	/**
	 * @param idRuta
	 * @uml.property  name="idRuta"
	 */
	public void setIdRuta(String idRuta) {
		this.idRuta = idRuta;
	}

	/**
	 * @return
	 * @uml.property  name="idRutaAdicional"
	 */
	public String getIdRutaAdicional() {
		return idRutaAdicional;
	}

	/**
	 * @param idRutaAdicional
	 * @uml.property  name="idRutaAdicional"
	 */
	public void setIdRutaAdicional(String idRutaAdicional) {
		this.idRutaAdicional = new String(idRutaAdicional);
	}

}
