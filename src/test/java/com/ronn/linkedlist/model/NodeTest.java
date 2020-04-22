package com.ronn.linkedlist.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testNodeInstantiation(){
    Node lastNode = new Node("X");
    Node headNode = new Node("R", lastNode);

    assertEquals("R", headNode.getData());
    assertTrue(headNode.hasNext());
    assertEquals(headNode.getNext(), lastNode);

    assertEquals("X", lastNode.getData());
    assertFalse(lastNode.hasNext());
  }
}
