package com.tit.week04.day02.queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {
        //create circular buffer
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();

        buffer.insert(4);
        buffer.display();
    }
}
