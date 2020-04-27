package com.ronn.queque.model;

import com.ronn.common.model.Node;

public class Queue {

  public Queue() {
  }

  private Node<String> first;
  private Node<String> last;

  public String peek() {
    return null != this.first ? this.first.getData(): null;
  }

  public void enqueue(String data){
    Node<String> newNode = new Node<>(data);

    if (isEmpty()){
      this.first = newNode;
    } else {
      this.last.setNext(newNode);
    }

    this.last = newNode;
  }

  public void dequeue(){
    if (!isEmpty()){
      Node<String> second = first.getNext();
      first.setNext(null);
      first = second;
    }
  }

  public String dispatch(){
    String data = this.peek();
    this.dequeue();

    return data;
  }

  public boolean isEmpty(){
    return null == this.first;
  }
}
