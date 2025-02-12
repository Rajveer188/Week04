package com.tit.week04.day02.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.out;

public class StackUsingQueue {
    private Queue<Integer> queueA = new LinkedList<>();
    private Queue<Integer> queueB= new LinkedList<>();

    //method to add element
    public void push(int x) {
        queueB.add(x);

        while (!queueA.isEmpty()) {
            queueB.add(queueA.poll());
        }

        Queue<Integer> temp = queueA;
        queueA = queueB;
        queueB = temp;
    }

    //method to remove element
    public void pop() {
        if (queueA.isEmpty()) {
            return;
        }
        queueA.poll();
    }

    //method to get top element
    public int top() {
        if (queueA.isEmpty()) {
            return -1;
        }
        return queueA.peek();
    }

    public static void main(String[] args) {
        //create custom stack
        StackUsingQueue stack = new StackUsingQueue();

        //perform stack operation
        stack.push(1);
        stack.push(2);
        stack.push(3);
        out.println(stack);
        out.println("Top element: " + stack.top());
    }
}
