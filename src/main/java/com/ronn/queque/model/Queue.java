package com.ronn.queque.model;

import com.ronn.common.model.Node;

public class Queue<T> {

  public Queue() {
  }

  private Node<T> first;
  private Node<T> last;

  public T peek() {
    return null != this.first ? this.first.getData(): null;
  }

  public void enqueue(T data){
    Node<T> newNode = new Node<>(data);

    if (isEmpty()){
      this.first = newNode;
    } else {
      this.last.setNext(newNode);
    }

    this.last = newNode;
  }

  public void dequeue(){
    if (!isEmpty()){
      Node<T> second = first.getNext();
      first.setNext(null);
      first = second;
    }
  }

  public T dispatch(){
    T data = this.peek();
    this.dequeue();

    return data;
  }

  public boolean isEmpty(){
    return null == this.first;
  }
}
