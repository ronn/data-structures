package com.ronn.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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
  public void checkInsertingDuplicateThrowsRuntimeException() {
    BinarySearchTree bst = new BinarySearchTree();

    bst.insert(2);

    Exception exception = assertThrows(RuntimeException.class, () -> bst.insert(2));

    String expectedMessage = "Duplicados ni por el putas";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
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

  @Test
  public void checkPreorder(){
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.preorder();

    BinarySearchTree bst = getBinarySearchTree();
    bst.preorder();
  }

  @Test
  public void checkInorder(){
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.inorder();

    BinarySearchTree bst = getBinarySearchTree();
    bst.inorder();
  }

  @Test
  public void checkPostorder(){
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.postorder();

    BinarySearchTree bst = getBinarySearchTree();
    bst.postorder();
  }

  private BinarySearchTree getBinarySearchTree() {
    BinarySearchTree bst = new BinarySearchTree();

    Arrays.asList(5, 4, 7, 6, 2, 3, 8, 9, 10, 1)
        .forEach(bst::insert);

    return bst;
  }

  @Test
  public void checkMaxValue(){
    BinarySearchTree bst = getBinarySearchTree();

    assertEquals(10, bst.getMax().intValue());

    assertEquals(4, bst.getLeft().getMax().intValue());
  }

  @Test
  public void checkRemoveLeaf(){
    BinarySearchTree bst = getBinarySearchTree();

    assertEquals(1, bst.get(1).intValue());
    assertEquals(10, bst.get(10).intValue());

    bst.remove(1);
    bst.remove(10);

    assertNull(bst.get(1));
    assertNull(bst.get(10));
  }

  @Test
  public void checkRemove1ChildsParent(){
    BinarySearchTree bst = getBinarySearchTree();

    assertEquals(4, bst.get(4).intValue());
    assertEquals(3, bst.get(3).intValue());
    assertEquals(8, bst.get(8).intValue());

    bst.remove(4);
    bst.remove(8);
    bst.remove(3);

    assertNull(bst.get(4));
    assertNull(bst.get(3));
    assertNull(bst.get(8));
  }

  @Test
  public void checkRemove2ChildsParent(){
    BinarySearchTree bst = getBinarySearchTree();

    assertEquals(5, bst.get(5).intValue());

    bst.remove(5);
    assertNull(bst.get(5));

    bst.preorder();
  }
}
