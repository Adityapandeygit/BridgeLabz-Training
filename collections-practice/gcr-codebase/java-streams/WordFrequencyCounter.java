package collections_practice.gcr_codebase.java_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String source = "C:\\Users\\a\\Desktop\\Source.txt";
		HashMap<String, Integer> wordCount = new HashMap<>();
		int count =0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(source));
			String line;
			while((line = br.readLine())!=null) {
				String[] words = line.split(" ");
				for(String w : words) {
					wordCount.put(w, wordCount.getOrDefault(w, 0)+1);
					count++;
				}
			}
		}
		catch (IOException e) {
	            e.printStackTrace();
	    }
		System.out.println("Total number of Words : "+ count);
		
		List<Integer> freqList = new ArrayList<>();
		for (String key : wordCount.keySet()) {
		    freqList.add(wordCount.get(key));
		}

		Collections.sort(freqList);

		System.out.println("Top 5 words with most frequency:");
		
		int printed = 0;
		Set<String> printedWords = new HashSet<>();
		for (int i = freqList.size() - 1; i >= 0 && printed < 5; i--) {
		    int freq = freqList.get(i);
		    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
		        if (entry.getValue() == freq && !printedWords.contains(entry.getKey())) {
		            System.out.println(entry.getKey() + " : " + freq);
		            printedWords.add(entry.getKey());
		            printed++;

		            if (printed == 5)
		                break;
		        }
		    }
		}
		
	}
	
}
