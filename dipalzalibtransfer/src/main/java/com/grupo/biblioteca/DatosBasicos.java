package com.grupo.biblioteca;

import java.io.DataInputStream;
import java.io.Serializable;

public abstract interface DatosBasicos extends Serializable
{
  public void decode(byte[] paramArrayOfByte);

  public void decode(DataInputStream paramDataInputStream);
  

  public byte[] encode();
}

