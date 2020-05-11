package com.ronn.tree;

public class BinarySearchTree implements IBST<Integer> {

  private Integer data;
  private BinarySearchTree left, right;

  @Override
  public Boolean isLeaf() {
    return data != null
        && left == null
        && right == null;
  }

  @Override
  public Boolean isEmpty() {
    return data == null;
  }

  @Override
  public void insert(Integer newData) {
    if (isEmpty()){
      this.data = newData;
    } else {
      if(newData.equals(this.data) ) {
        throw new RuntimeException("Duplicados ni por el putas");
      }

      if (newData < data){
        if (left == null){
          left = new BinarySearchTree();
        }
        left.insert(newData);
      } else {
        if (right == null){
          right = new BinarySearchTree();
        }
        right.insert(newData);
      }
    }
  }

  @Override
  public Boolean exists(Integer id) {
    if(isEmpty()) return false;

    if (id.equals(data)) return true;

    return id > data
        ? right != null ? right.exists(id) : false
        : left != null ? left.exists(id) : false;
  }

  @Override
  public Integer get(Integer id) {
    if(isEmpty()) return null;

    if (id.equals(data)) return data;

    return id > data
        ? right != null ? right.get(id) : null
        : left != null ? left.get(id) : null;
  }

  @Override
  public void preorder() {
    if (isEmpty()) return;

    System.out.println(data);

    if (left != null) {
      left.preorder();
    }


    if (right != null) {
      right.preorder();
    }
  }

  @Override
  public void inorder() {
    if (isEmpty()) return;

    if (left != null) {
      left.inorder();
    }

    System.out.println(data);

    if (right != null) {
      right.inorder();
    }
  }

  @Override
  public void postorder() {
    if (isEmpty()) return;

    if (right != null) {
      right.postorder();
    }

    if (left != null) {
      left.postorder();
    }

    System.out.println(data);
  }

  @Override
  public void remove(Integer id) {

  }

  public Integer getMax(){
    if (right != null ){
      return right.getMax();
    }

    return data;
  }

  public BinarySearchTree getLeft() {
    return left;
  }

  public BinarySearchTree getRight() {
    return right;
  }

  public Integer getData() {
    return data;
  }
}
