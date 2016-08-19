package com.grupo.biblioteca;

import java.util.Vector;

public abstract interface IEmmiter
{
  public abstract boolean send(MessageToTransmit paramMessageToTransmit);

  public abstract boolean send(Vector<MessageToTransmit> paramVector);
}
