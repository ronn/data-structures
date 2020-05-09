package com.ronn.tree;

public interface IBST<T extends Comparable> {

  void insert(T newData);

  Boolean exists(Integer id);

  T get(Integer id);

  Boolean isLeaf();

  Boolean isEmpty();

  void preorder();

  void inorder();

  void postorder();

  void remove(Integer id);
}
