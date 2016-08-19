package com.grupo.biblioteca.server.events;

//~--- non-JDK imports --------------------------------------------------------

import com.grupo.biblioteca.server.ConnectionClient;

//~--- JDK imports ------------------------------------------------------------

import java.util.EventObject;

/**
 * Class description
 *
 *
 * @version        Enter version here..., 22.mayo 2012
 * @author         Enter your name here...
 */
public class ConnectionClientEvent extends EventObject
{

    private static final long serialVersionUID = 1L;

    private ConnectionClient client;

    public ConnectionClientEvent(Object source, ConnectionClient client)
    {
        super(source);
        this.client = client;
    }

    /**
	 * Method description
	 * @return
	 * @uml.property  name="client"
	 */
    public ConnectionClient getClient()
    {
        return this.client;
    }

    /**
	 * Method description
	 * @param  client
	 * @uml.property  name="client"
	 */
    public void setClient(ConnectionClient client)
    {
        this.client = client;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
