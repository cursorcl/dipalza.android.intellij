package com.grupo.basedatos;

import com.grupo.basedatos.itfz.ADatosBasicos;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends ADatosBasicos
{
  /**
 * @uml.property  name="rut"
 */
private String rut;
  /**
 * @uml.property  name="razonSocial"
 */
private String razonSocial;
  /**
 * @uml.property  name="comuna"
 */
private String comuna;
  /**
 * @uml.property  name="direccion"
 */
private String direccion;
  /**
 * @uml.property  name="ciudad"
 */
private String ciudad;
  /**
 * @uml.property  name="telefono"
 */
private String telefono;
  /**
 * @uml.property  name="borrado"
 */
private boolean borrado;
  /**
 * @uml.property  name="estado"
 */
private int estado = 0;
  /**
 * @uml.property  name="vendedor"
 */
private String vendedor = "000";
  /**
 * @uml.property  name="ruta"
 */
private String ruta = "000";
  /**
 * @uml.property  name="codigo"
 */
private String codigo;

  public Cliente()
  {
    this.codigo = "   ";
  }

  /**
 * @return
 * @uml.property  name="rut"
 */
public String getRut() {
    return this.rut;
  }

  /**
 * @return
 * @uml.property  name="razonSocial"
 */
public String getRazonSocial() {
    return this.razonSocial;
  }

  /**
 * @return
 * @uml.property  name="direccion"
 */
public String getDireccion() {
    return this.direccion;
  }

  /**
 * @return
 * @uml.property  name="ciudad"
 */
public String getCiudad() {
    return this.ciudad;
  }

  /**
 * @return
 * @uml.property  name="telefono"
 */
public String getTelefono() {
    return this.telefono;
  }

  /**
 * @param rut
 * @uml.property  name="rut"
 */
public void setRut(String rut) {
    this.rut = rut;
  }

  /**
 * @param razonSocial
 * @uml.property  name="razonSocial"
 */
public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  /**
 * @param ciudad
 * @uml.property  name="ciudad"
 */
public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  /**
 * @param direccion
 * @uml.property  name="direccion"
 */
public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
 * @param telefono
 * @uml.property  name="telefono"
 */
public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void decode(DataInputStream inputStream)
  {
    try {
      this.borrado = inputStream.readBoolean();
      this.rut = inputStream.readUTF();
      this.razonSocial = inputStream.readUTF();
      this.direccion = inputStream.readUTF();
      this.comuna = inputStream.readUTF();
      this.ciudad = inputStream.readUTF();
      this.telefono = inputStream.readUTF();
      this.estado = inputStream.readByte();
      this.vendedor = inputStream.readUTF();
      this.ruta = inputStream.readUTF();
      this.codigo = inputStream.readUTF();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String toString()
  {
    return this.codigo + ":" + getRazonSocial().toUpperCase();
  }

  public byte[] encode() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream outputStream = new DataOutputStream(baos);
    try {
      outputStream.writeBoolean(this.borrado);
      outputStream.writeUTF(this.rut);
      outputStream.writeUTF(this.razonSocial);
      outputStream.writeUTF(this.direccion);
      outputStream.writeUTF(this.comuna);
      outputStream.writeUTF(this.ciudad);
      outputStream.writeUTF(this.telefono);
      outputStream.writeByte(this.estado);
      outputStream.writeUTF(this.vendedor);
      outputStream.writeUTF(this.ruta);
      outputStream.writeUTF(this.codigo);
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
    }
    byte[] buffer = baos.toByteArray();
    return buffer;
  }

  /**
 * @return
 * @uml.property  name="borrado"
 */
public boolean isBorrado() {
    return this.borrado;
  }

  /**
 * @param borrado
 * @uml.property  name="borrado"
 */
public void setBorrado(boolean borrado) {
    this.borrado = borrado;
  }

  /**
 * @return
 * @uml.property  name="comuna"
 */
public String getComuna() {
    return this.comuna;
  }

  /**
 * @param comuna
 * @uml.property  name="comuna"
 */
public void setComuna(String comuna) {
    this.comuna = comuna;
  }

  /**
 * @param estado
 * @uml.property  name="estado"
 */
public void setEstado(int estado) {
    this.estado = estado;
  }

  /**
 * @return
 * @uml.property  name="estado"
 */
public int getEstado() {
    return this.estado;
  }

  /**
 * @return
 * @uml.property  name="vendedor"
 */
public String getVendedor() {
    return this.vendedor;
  }

  /**
 * @param vendedor
 * @uml.property  name="vendedor"
 */
public void setVendedor(String vendedor) {
    this.vendedor = vendedor;
  }

  /**
 * @return
 * @uml.property  name="ruta"
 */
public String getRuta() {
    return this.ruta;
  }

  /**
 * @param ruta
 * @uml.property  name="ruta"
 */
public void setRuta(String ruta) {
    this.ruta = ruta;
  }

  /**
 * @return
 * @uml.property  name="codigo"
 */
public String getCodigo() {
    return this.codigo;
  }

  /**
 * @param codigo
 * @uml.property  name="codigo"
 */
public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
}
