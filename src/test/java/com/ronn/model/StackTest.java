package com.ronn.model;

import com.ronn.stack.model.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

  @Test
  public void checkAllOpsWork(){
    Stack<String> myStack = new Stack<>();
    assertTrue(myStack.isEmpty());

    myStack.push("Hola");
    assertFalse(myStack.isEmpty());
    assertEquals("Hola", myStack.peek());

    myStack.push("Adiós");
    assertEquals("Adiós", myStack.peek());
    assertEquals(2, myStack.size);

    myStack.pop();
    assertEquals("Hola", myStack.peek());

    myStack.pop();
    assertTrue(myStack.isEmpty());
  }
}
