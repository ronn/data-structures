package com.ronn.stack.model;

import com.ronn.common.model.Node;

public class Stack<T> {

  private Node<T> head = null;
  public int size = 0;

  public void push(T obj){
    Node<T> newHead = new Node<>(obj);

    newHead.setNext(head);
    head = newHead;

    size ++;
  }

  public T peek(){
    return isEmpty() ? null : head.getData();
  }

  public void pop(){
    if (!isEmpty()){
      Node<T> toRemove = this.head;
      head = head.getNext();
      toRemove.setNext(null);

      size --;
    }
  }

  public Boolean isEmpty(){
    return head == null;
  }
}
