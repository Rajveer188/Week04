package com.tit.week04.day02.queue_interface;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseQueue {
    //method to reverse queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        //creat stack to store queue element
        Stack<Integer> stack = new Stack<>();

        //add element of queue to stack
        while (!queue.isEmpty()) {
            int currentElement = queue.remove();
            stack.push(currentElement);
        }
        //add element of stack to queue
        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            queue.add(currentElement);
        }
        return queue;
    }

    public static void main(String[] args) {
        //create a queue and add element
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        //reverse the queue
        Queue<Integer> reversedQueue = reverseQueue(queue);

        //print reversed queue
        System.out.println("reversed queue- " + reversedQueue);
    }
}
