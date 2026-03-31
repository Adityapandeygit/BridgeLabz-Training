package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVChunkReader {
	 static final int chunk_size = 100;
	    public static void main(String[] args) {
	        String filePath = "large_file.csv";
	        List<String> chunk = new ArrayList<>(chunk_size);
	        int totalProcessed = 0;
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            br.readLine(); 
	            while ((line = br.readLine()) != null) {
	                chunk.add(line);
	                if (chunk.size() == chunk_size) {
	                    totalProcessed += processChunk(chunk);
	                    chunk.clear(); 
	                }
	            }

	            if (!chunk.isEmpty()) {
	                totalProcessed += processChunk(chunk);
	            }

	            System.out.println("✅ Total Records Processed: " + totalProcessed);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static int processChunk(List<String> chunk) {
	        System.out.println("Processing chunk of size: " + chunk.size());
	        return chunk.size();
	    }
}
