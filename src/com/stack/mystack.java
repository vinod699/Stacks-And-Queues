
package com.stack;
public class mystack {

    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void show(){
        myLinkedList.show();
    }

    public INode peak(){
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }

}