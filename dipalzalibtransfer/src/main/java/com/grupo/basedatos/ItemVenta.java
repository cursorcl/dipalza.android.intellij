package com.grupo.basedatos;

import com.grupo.basedatos.itfz.ADatosBasicos;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ItemVenta extends ADatosBasicos
{
  /**
 * @uml.property  name="codigoProducto"
 */
private short codigoProducto;
  /**
 * @uml.property  name="articulo"
 */
private String articulo;
  /**
 * @uml.property  name="cantidad"
 */
private float cantidad;
  /**
 * @uml.property  name="neto"
 */
private float neto;
  /**
 * @uml.property  name="descuento"
 */
private float descuento;
  /**
 * @uml.property  name="ila"
 */
private float ila;
  /**
 * @uml.property  name="oldCantidad"
 */
private float oldCantidad = 0.0F;

  public ItemVenta()
  {
    this.codigoProducto = 0;
    this.articulo = "";
    this.cantidad = 0.0F;
    this.neto = 0.0F;
    this.descuento = 0.0F;
    this.ila = 0.0F;
  }

  public ItemVenta(short codigo, String articulo, float cantidad, float total, float descuento, float ila)
  {
    this.codigoProducto = codigo;
    this.articulo = articulo;
    this.cantidad = cantidad;
    this.neto = total;
    this.descuento = descuento;
    this.ila = ila;
  }

  /**
 * @return
 * @uml.property  name="cantidad"
 */
public float getCantidad() {
    return this.cantidad;
  }

  /**
 * @return
 * @uml.property  name="codigoProducto"
 */
public short getCodigoProducto() {
    return this.codigoProducto;
  }

  /**
 * @return
 * @uml.property  name="neto"
 */
public float getNeto() {
    return this.neto;
  }

  /**
 * @return
 * @uml.property  name="ila"
 */
public float getIla() {
    return this.ila;
  }

  /**
 * @param ila
 * @uml.property  name="ila"
 */
public void setIla(float ila) {
    this.ila = ila;
  }

  /**
 * @param cantidad
 * @uml.property  name="cantidad"
 */
public void setCantidad(float cantidad) {
    this.cantidad = cantidad;
  }

  /**
 * @param codigoProducto
 * @uml.property  name="codigoProducto"
 */
public void setCodigoProducto(short codigoProducto) {
    this.codigoProducto = codigoProducto;
  }

  /**
 * @param total
 * @uml.property  name="neto"
 */
public void setNeto(float total) {
    this.neto = total;
  }

  /**
 * @return
 * @uml.property  name="articulo"
 */
public String getArticulo() {
    return this.articulo;
  }

  /**
 * @param articulo
 * @uml.property  name="articulo"
 */
public void setArticulo(String articulo) {
    this.articulo = articulo;
  }

  /**
 * @return
 * @uml.property  name="descuento"
 */
public float getDescuento() {
    return this.descuento;
  }

  /**
 * @param descuento
 * @uml.property  name="descuento"
 */
public void setDescuento(float descuento) {
    this.descuento = descuento;
  }

  /**
 * @return
 * @uml.property  name="oldCantidad"
 */
public float getOldCantidad() {
    return this.oldCantidad;
  }

  /**
 * @param oldCantidad
 * @uml.property  name="oldCantidad"
 */
public void setOldCantidad(float oldCantidad) {
    this.oldCantidad = oldCantidad;
  }

  public String toString() {
    return this.articulo + "  " + this.cantidad;
  }

  public void decode(DataInputStream inputStream)
  {
    try
    {
      setCodigoProducto(inputStream.readShort());
      setCantidad(inputStream.readFloat());
      setNeto(inputStream.readFloat());
      setDescuento(inputStream.readFloat());
      setArticulo(inputStream.readUTF());
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public byte[] encode()
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream outputStream = new DataOutputStream(baos);
    try {
      outputStream.writeShort(getCodigoProducto());
      outputStream.writeFloat(getCantidad());
      outputStream.writeFloat(getNeto());
      outputStream.writeFloat(getDescuento());
      outputStream.writeUTF(getArticulo());
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    byte[] buffer = baos.toByteArray();
    return buffer;
  }
}
