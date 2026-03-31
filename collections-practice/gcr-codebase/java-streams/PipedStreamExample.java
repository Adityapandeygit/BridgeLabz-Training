package collections_practice.gcr_codebase.java_streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
	public static void main(String[] args) {
		try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Writer Thread
            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello from Writer Thread!";
                    pos.write(message.getBytes());
                    pos.close();
                } catch (IOException e) {
                    System.out.println("Writer thread error:");
                    e.printStackTrace();
                }
            });

            // Reader Thread
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader thread error:");
                    e.printStackTrace();
                }
            });

            // Start threads
            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error:");
            e.printStackTrace();
        }
	}
	
}
