package com.tit.week02.day03.piped_streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class InterThreadCommunication {
    //method to write data
    private static void writeData(PipedOutputStream pos) {
        try (pos) {
            String message = "Hey it's me from writer thread";
            pos.write(message.getBytes());
            System.out.println("Writer Data written.");
        } catch (IOException e) {
            System.out.println("Writer error ");
        }
    }

    //method to read data
    private static void readData(PipedInputStream pis) {
        try (pis) {
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader- Received - " + receivedMessage);
        } catch (IOException e) {
            System.out.println("Reader error " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            //thread for write data
            Thread writer = new Thread(() -> writeData(pipedOutputStream));
            //thread for read data
            Thread reader = new Thread(() -> readData(pipedInputStream));

            writer.start();
            reader.start();

        } catch (IOException e) {
            System.out.println("pipe connection error");
        }
    }
}
