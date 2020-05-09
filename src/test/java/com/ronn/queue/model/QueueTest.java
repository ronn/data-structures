package com.ronn.queue.model;

import com.ronn.queque.model.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

  private Queue<String> q = new Queue<>();

  @Test
  public void canAdd(){
    q = new Queue<>();
    assertTrue(q.isEmpty());

    q.enqueue("Hola");
    assertFalse(q.isEmpty());

    q.enqueue("Chao");
    assertFalse(q.isEmpty());
  }

  @Test
  public void checkPeek(){
    q = new Queue<>();
    assertNull(q.peek());

    q.enqueue("Adiós");
    assertEquals(q.peek(), "Adiós");
  }

  @Test
  public void canDequeue(){
    q = new Queue<>();

    q.enqueue("Hola");
    assertFalse(q.isEmpty());

    q.dequeue();
    assertTrue(q.isEmpty());
  }

  @Test
  public void canDispatch(){
    q = new Queue<>();
    q.enqueue("Hola");

    String first = q.dispatch();

    assertNotSame(q.peek(), first);
  }

}
