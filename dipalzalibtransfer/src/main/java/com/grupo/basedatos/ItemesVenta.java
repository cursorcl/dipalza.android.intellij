package com.grupo.basedatos;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import com.grupo.basedatos.itfz.ADatosBasicos;

public class ItemesVenta extends ADatosBasicos
{
  /**
 * @uml.property  name="items"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="com.grupo.basedatos.ItemVenta"
 */
private Vector<ItemVenta> items = null;

  /**
 * @uml.property  name="droped"
 */
private boolean droped = false;

  public ItemesVenta()
  {
    this.items = new Vector<ItemVenta>();
  }

  public void decode(DataInputStream inputStream)
  {
    try
    {
      int size = inputStream.readInt();
      this.items = new Vector<ItemVenta>(size);
      for (int n = 0; n < size; ++n) {
        ItemVenta v = new ItemVenta();
        v.setCodigoProducto(inputStream.readShort());
        v.setCantidad(inputStream.readFloat());
        v.setNeto(inputStream.readFloat());
        v.setDescuento(inputStream.readFloat());
        v.setArticulo(inputStream.readUTF());
        this.items.addElement(v);
      }
      this.droped = inputStream.readBoolean();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public byte[] encode()
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream outputStream = new DataOutputStream(baos);
    try {
      outputStream.writeInt(this.items.size());
      for (int n = 0; n < this.items.size(); ++n) {
        ItemVenta v = (ItemVenta)this.items.elementAt(n);
        outputStream.write(v.encode());
      }
      outputStream.writeBoolean(this.droped);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    byte[] buffer = baos.toByteArray();
    return buffer;
  }

  public void add(ItemVenta venta, int idx) {
    if (idx == -1) {
      this.items.addElement(venta);
    }
    else {
      ItemVenta v = (ItemVenta)this.items.elementAt(idx);
      venta.setOldCantidad(v.getCantidad());
      this.items.setElementAt(venta, idx);
    }
  }

  public void add(ItemVenta venta) {
    add(venta, -1);
  }

  public void modify(int idx, ItemVenta venta) {
    if ((idx >= 0) && (idx < this.items.size()))
      this.items.setElementAt(venta, idx);
  }

  public void delete(int idx)
  {
    if ((idx >= 0) && (idx < this.items.size()))
      this.items.removeElementAt(idx);
  }

  public void deleteAll()
  {
    if (this.items != null)
      this.items.removeAllElements();
  }

  public void set(ItemesVenta ventas)
  {
    this.items.removeAllElements();
    if (ventas != null) {
      Vector<ItemVenta> v = ventas.getAll();
      if (v != null)
        for (int n = 0; n < v.size(); ++n)
          items.addElement(v.elementAt(n));
    }
  }

  public int size()
  {
    return this.items.size();
  }

  public Vector<ItemVenta> getAll() {
    return items;
  }

  /**
 * @return
 * @uml.property  name="droped"
 */
public boolean isDroped()
  {
    return this.droped;
  }

  /**
 * @param droped
 * @uml.property  name="droped"
 */
public void setDroped(boolean droped)
  {
    this.droped = droped;
  }
  
  public ItemVenta elementAt(int index) {
	  return items.elementAt(index);
  }
}
