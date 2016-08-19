package com.grupo.biblioteca;

public enum EMessagesTypes
{
  MSG_CLIENTE(0, "CLIENTE"), 
  MSG_DATOSINICIALIZACION(1, "INICIALIZACION"), 
  MSG_ENCABEZADO(2, "ENCABEZADO VENTA"), 
  MSG_NROITEMESVENTA(3, "CANTIDAD ITEMES VENTA"), 
  MSG_ITEMVENTA(4, "REGISTRO DE VENTA"), 
  MSG_INITIALIZE_PRODUCTO(5, "PRODUCTO"), 
  MSG_INITIALIZE_CLIENTE(6, "CLIENTE"),
  MSG_INITIALIZE_CLIENTE_FINALIZED(7, "FINALIZA TRANSMISION DE CLIENTES"),
  MSG_INITIALIZE_PRODUCTO_FINALIZED(8, "FINALIZA TRANSMISION DE PRODUCTOS"),
  MSG_INFORMATIVE(9, "INFORMATIVO"),
  MSG_VECTORCLIENTES(10, "LISTA DE CLIENTES"),
  MSG_VECTORPRODUCTOS(11, "LISTA DE PRODUCTOS"),
  MSG_VECTORVENTAS(12, "LISTA DE VENTAS");
  
  

  /**
 * @uml.property  name="id"
 */
private int id;
  /**
 * @uml.property  name="name"
 */
private String name;

  private EMessagesTypes(int id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
 * @return
 * @uml.property  name="id"
 */
public int getId() {
    return this.id;
  }

  /**
 * @param id
 * @uml.property  name="id"
 */
public void setId(int id) {
    this.id = id;
  }

  /**
 * @return
 * @uml.property  name="name"
 */
public String getName() {
    return this.name;
  }

  /**
 * @param name
 * @uml.property  name="name"
 */
public void setName(String name) {
    this.name = name;
  }
}
