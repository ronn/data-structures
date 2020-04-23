package com.ronn.linkedlist.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testNodeInstantiation(){
    Node<String> lastNode = new Node<>("X");
    Node<String> headNode = new Node<>("R", lastNode);

    assertEquals("R", headNode.getData());
    assertTrue(headNode.hasNext());
    assertEquals(headNode.getNext(), lastNode);

    assertEquals("X", lastNode.getData());
    assertFalse(lastNode.hasNext());
  }
}
