package com.grupo.utilitarios;

import java.util.LinkedList;
import java.util.Queue;

public class ReceptorProcesador
  implements Runnable
{
  /**
 * @uml.property  name="queue"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.Integer"
 */
private Queue<Object> queue;
  /**
 * @uml.property  name="ejecutor"
 * @uml.associationEnd  multiplicity="(1 1)"
 */
private IProcessor ejecutor;
  /**
 * @uml.property  name="alive"
 */
private boolean alive = true;

  public ReceptorProcesador(IProcessor ejecutor) {
    this.ejecutor = ejecutor;
    this.queue = new LinkedList<Object>();
    new Thread(this).start();
  }

  public synchronized void add(Object element) {
    this.queue.add(element);
  }

  /**
 * @return
 * @uml.property  name="alive"
 */
public synchronized boolean isAlive() {
    return this.alive;
  }

  /**
 * @param alive
 * @uml.property  name="alive"
 */
public synchronized void setAlive(boolean alive) {
    this.alive = alive;
  }

  /**
 * @param ejecutor
 * @uml.property  name="ejecutor"
 */
public synchronized void setEjecutor(IProcessor ejecutor) {
    this.ejecutor = ejecutor;
  }

  public void run()
  {
    while (isAlive()) {
      synchronized (this) {
        if ((ejecutor != null) && (queue.size() > 0)) {
          ejecutor.process(queue.poll());
          queue.remove(0);
        }
      }
      try {
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }
}
