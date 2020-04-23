package com.ronn.linkedlist.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

  @Test
  public void testIfEmptiness(){
    LinkedList ll = new LinkedList();
    assertTrue(ll.isEmpty());
  }

  @Test
  public void testListCanAppend(){
    LinkedList ll = new LinkedList();

    ll.append("S");
    assertEquals(ll.getLast().getData(), "S");

    ll.append("J");
    assertEquals(ll.getLast().getData(), "J");
  }

  @Test
  public void testContains(){
    LinkedList ll = new LinkedList();

    assertFalse(ll.contains("Nothing"));

    ll.append("Something");
    assertTrue(ll.contains("Something"));

    assertFalse(ll.contains("Anything"));
  }

  @Test
  public void testPrepend(){
    LinkedList ll = new LinkedList();

    ll.prepend("Hola");
    assertEquals("Hola", ll.getHead().getData());

    ll.prepend("Chao");
    assertEquals("Chao", ll.getHead().getData());
  }
}