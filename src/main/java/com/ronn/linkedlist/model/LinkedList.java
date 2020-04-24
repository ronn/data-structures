package com.ronn.linkedlist.model;

import com.ronn.common.model.Node;

public class LinkedList<T> {

  private Node<T> head;

  public LinkedList() {
  }

  public void prepend(T data){
    Node<T> newHead = new Node<>(data);
    newHead.setNext(this.head);
    this.head = newHead;
  }

  public void append(T data){
    Node<T> newNode = new Node<>(data);

    if (isEmpty()) {
      this.head = newNode;
    } else {
      getLast().setNext(newNode);
    }
  }

  protected Node<T> getLast(){
    Node<T> last = this.head;

    while (last.hasNext()){
      last = last.getNext();
    }

    return last;
  }

  protected Node<T> getHead() {
    return head;
  }

  public boolean contains(T data){
    if (isEmpty()) return false;

    Node<T> actual = this.head;

    do {
      if (data.equals(actual.getData())){
        return true;
      }

      actual = actual.getNext();
    } while (actual != null && actual.hasNext());

    return false;
  }

  public boolean isEmpty(){
    return this.head == null;
  }
}
