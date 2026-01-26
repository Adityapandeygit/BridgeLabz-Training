package collections_practice.gcr_codebase.java_streams;

import java.io.*;

public class BufferedFileCopyvsUnbufferedFileCopy {

    public static void main(String[] args) {

        String source = "C:\\Users\\a\\Desktop\\Source.txt";
        String destination = "C:\\Users\\a\\Desktop\\Destination.txt";
        // UNBUFFERED COPY 
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096]; 
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Unbuffered file copied successfully.");

        } catch (IOException e) {
            System.out.println("File does not exist");
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered copy time: " +(endTime - startTime)+ " ms");
        
        //  BUFFERED COPY 
        long bufferedStartTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // 4 KB
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered file copied successfully.");

        } catch (IOException e) {
        	System.out.println("File does not exist");
        }

        long bufferedEndTime = System.nanoTime();
        System.out.println("Buffered copy time: " +(bufferedEndTime - bufferedStartTime) + " ms");
    }
}
