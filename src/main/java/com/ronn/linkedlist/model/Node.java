package com.ronn.linkedlist.model;

public class Node {

  private final Object data;
  private Node next;

  public Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(Object data) {
    this.data = data;
  }

  public Object getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public boolean hasNext(){
    return this.next != null;
  }
}
