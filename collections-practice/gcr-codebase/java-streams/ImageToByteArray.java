package collections_practice.gcr_codebase.java_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageToByteArray {
	public static void main(String[] args) {
		String sourceImage = "C:\\Users\\a\\Desktop\\source.jpg";
        String destinationImage = "C:\\Users\\a\\Desktop\\copied.jpg";
        try {
        	FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            
            byte[] imageBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImage);
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            fos.close();
            bais.close();
            
            System.out.println("Image copied successfully using ByteArray Streams.");
            
            
        }
        catch (IOException e) {
            System.out.println("Error while processing image:");
            e.printStackTrace();
        }
	}
}
