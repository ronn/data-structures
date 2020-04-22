package com.ronn.linkedlist.model;

public class LinkedList {

  private Node head;

  public LinkedList() {
  }

  public void append(Object data){
    Node newNode = new Node(data);

    if (isEmpty()) {
      this.head = newNode;
    } else {
      getLast().setNext(newNode);
    }
  }

  protected Node getLast(){
    Node last = this.head;

    while (last.hasNext()){
      last = last.getNext();
    }

    return last;
  }

  public boolean contains(Object data){
    if (isEmpty()) return false;

    Node actual = this.head;

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
