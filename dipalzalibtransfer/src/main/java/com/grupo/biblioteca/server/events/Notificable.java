package com.grupo.biblioteca.server.events;

import java.util.EventObject;

public interface Notificable
{
  void handle(EventObject paramEventObject);
}
