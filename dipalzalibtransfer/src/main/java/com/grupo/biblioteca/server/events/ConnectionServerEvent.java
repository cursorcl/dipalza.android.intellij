package com.grupo.biblioteca.server.events;

import java.net.ServerSocket;
import java.util.EventObject;

public class ConnectionServerEvent extends EventObject {

  private static final long serialVersionUID = 1L;
  private ServerSocket server;

  public ConnectionServerEvent(Object source, ServerSocket server) {
    super(source);
    this.server = server;
  }

  public ServerSocket getServer() {
    return server;
  }

  public void setServer(ServerSocket server) {
    this.server = server;
  }
}
