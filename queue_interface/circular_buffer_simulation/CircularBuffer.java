package com.tit.week04.day02.queue_interface.circular_buffer_simulation;

import static java.lang.System.out;

public class CircularBuffer {
    //Attribute
    private int[] buffer;
    private int size, front, rear, count;

    // Constructor
    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }
    //method to insert
    public void insert(int value) {
        //if buffer full, overwrite
        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }
        rear = (rear + 1) % size;
        buffer[rear] = value;
    }
    //method to display
    public void display() {
        for (int i = 0; i < count; i++) {
            out.print(buffer[(front + i) % size] + " ");
        }
        out.println();
    }
}
