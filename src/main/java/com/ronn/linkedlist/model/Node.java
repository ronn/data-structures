package com.ronn.linkedlist.model;

class Node<T> {

  private final T data;
  private Node<T> next;

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public boolean hasNext(){
    return this.next != null;
  }
}
