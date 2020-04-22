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
  }

  @Test
  public void testContains(){
    LinkedList ll = new LinkedList();

    assertFalse(ll.contains("Nothing"));

    ll.append("Something");
    assertTrue(ll.contains("Something"));
  }
}
