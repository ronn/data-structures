package com.ronn.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {

  @Test
  public void canInsert(){
    BinarySearchTree bst = new BinarySearchTree();

    assertTrue(bst.isEmpty());

    bst.insert(2);
    assertFalse(bst.isEmpty());
    assertTrue(bst.isLeaf());

    bst.insert(3);
    assertFalse(bst.isLeaf());

    assertFalse(bst.getRight().isEmpty());
    assertTrue(bst.getRight().isLeaf());

    bst.insert(1);

    assertFalse(bst.getLeft().isEmpty());
    assertTrue(bst.getLeft().isLeaf());
  }

  @Test
  public void checkExists (){
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    assertFalse(binarySearchTree.exists(2));

    binarySearchTree.insert(2);

    assertTrue(binarySearchTree.exists(2));

    assertFalse(binarySearchTree.exists(3));
    assertFalse(binarySearchTree.exists(1));

    binarySearchTree.insert(1);
    binarySearchTree.insert(3);

    assertTrue(binarySearchTree.exists(3));
    assertTrue(binarySearchTree.exists(1));
  }

  @Test
  public void canGetElementsFromTree (){
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    assertFalse(binarySearchTree.exists(2));

    binarySearchTree.insert(2);

    assertEquals(Integer.valueOf(2), binarySearchTree.get(2));
    assertNull(binarySearchTree.get(1));
    assertNull(binarySearchTree.get(5));

    binarySearchTree.insert(1);
    binarySearchTree.insert(5);

    assertNotNull(binarySearchTree.get(1));
    assertNotNull(binarySearchTree.get(5));
  }
}
