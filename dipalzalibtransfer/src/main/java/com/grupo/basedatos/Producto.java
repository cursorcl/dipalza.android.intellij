package com.grupo.basedatos;

import com.grupo.basedatos.itfz.ADatosBasicos;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Producto extends ADatosBasicos
{
  /**
 * @uml.property  name="articulo"
 */
private String articulo;
  /**
 * @uml.property  name="idProducto"
 */
private short idProducto;
  /**
 * @uml.property  name="nombre"
 */
private String nombre;
  /**
 * @uml.property  name="stock"
 */
private float stock;
  /**
 * @uml.property  name="precio"
 */
private float precio;
  /**
 * @uml.property  name="unidad"
 */
private String unidad;
  /**
 * @uml.property  name="proveedor"
 */
private String proveedor;
  /**
 * @uml.property  name="costo"
 */
private float costo;
  /**
 * @uml.property  name="ila"
 */
private float ila;

  public Producto()
  {
    this.articulo = "";
    this.idProducto = 0;
    this.nombre = "Producto";
    this.stock = 0.0F;
    this.precio = 0.0F;
    this.unidad = "pack";
    this.proveedor = "Colun";
    this.costo = 0.0F;
    this.ila = 0.0F;
  }

  public Producto(String articulo, short id, String nombre, float stock, float precio, String unidad, String prov, float costo, float ila)
  {
    this.articulo = articulo;
    this.idProducto = id;
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
    this.unidad = unidad;
    this.proveedor = prov;
    this.costo = costo;
    this.ila = ila;
  }

  /**
 * @return
 * @uml.property  name="idProducto"
 */
public short getIdProducto() {
    return this.idProducto;
  }

  /**
 * @return
 * @uml.property  name="nombre"
 */
public String getNombre() {
    return this.nombre;
  }

  /**
 * @return
 * @uml.property  name="precio"
 */
public float getPrecio() {
    return this.precio;
  }

  /**
 * @return
 * @uml.property  name="proveedor"
 */
public String getProveedor() {
    return this.proveedor;
  }

  /**
 * @return
 * @uml.property  name="stock"
 */
public float getStock() {
    return this.stock;
  }

  /**
 * @return
 * @uml.property  name="unidad"
 */
public String getUnidad() {
    return this.unidad;
  }

  /**
 * @param idProducto
 * @uml.property  name="idProducto"
 */
public void setIdProducto(short idProducto) {
    this.idProducto = idProducto;
  }

  /**
 * @param nombre
 * @uml.property  name="nombre"
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
 * @param precio
 * @uml.property  name="precio"
 */
public void setPrecio(float precio) {
    this.precio = precio;
  }

  /**
 * @param proveedor
 * @uml.property  name="proveedor"
 */
public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
  }

  /**
 * @param stock
 * @uml.property  name="stock"
 */
public void setStock(float stock) {
    this.stock = stock;
  }

  /**
 * @param unidad
 * @uml.property  name="unidad"
 */
public void setUnidad(String unidad) {
    this.unidad = unidad;
  }

  public void decode(DataInputStream inputStream)
  {
    try {
      this.articulo = inputStream.readUTF();
      this.idProducto = inputStream.readShort();
      this.nombre = inputStream.readUTF();
      this.precio = inputStream.readFloat();
      this.stock = inputStream.readFloat();
      this.unidad = inputStream.readUTF();
      this.proveedor = inputStream.readUTF();
      this.costo = inputStream.readFloat();
      this.ila = inputStream.readFloat();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public byte[] encode() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream outputStream = new DataOutputStream(baos);
    try {
      outputStream.writeUTF(this.articulo);
      outputStream.writeShort(this.idProducto);
      outputStream.writeUTF(this.nombre);
      outputStream.writeFloat(this.precio);
      outputStream.writeFloat(this.stock);
      outputStream.writeUTF(this.unidad);
      outputStream.writeUTF(this.proveedor);
      outputStream.writeFloat(this.costo);
      outputStream.writeFloat(this.ila);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    byte[] buffer = baos.toByteArray();
    return buffer;
  }

  public String toString()
  {
    String retValue = this.nombre.trim();
    return retValue;
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
 * @uml.property  name="costo"
 */
public float getCosto() {
    return this.costo;
  }

  /**
 * @param costo
 * @uml.property  name="costo"
 */
public void setCosto(float costo) {
    this.costo = costo;
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
}
