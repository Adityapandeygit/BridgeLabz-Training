package dsa_practice.gcr_codebase.linearandbinarysearch;

public class LinearSearchWord {
	public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
	}
	public static void main(String[] args) {
		String[] sentences = {
	            "Java is a powerful language",
	            "Data structures are important",
	            "Linear search is simple",
	            "Machine learning is the future"
	        };
		String word = "search";
		String result = searchSentence(sentences, word);
        System.out.println(result);
	}
}
