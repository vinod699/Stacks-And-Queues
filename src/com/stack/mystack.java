package com.stack;
public class mystack {

    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack(){
        myLinkedList.show();
    }

    //it is used to peak  the element from the stack.
    public INode peak(){
        return myLinkedList.head;
    }
}