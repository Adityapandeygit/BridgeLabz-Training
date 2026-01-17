package dsa_practice.gcr_codebase.stringBuilderandstringBuffer;

public class StringBufferVsStringBuilder {
	
	public static void main(String[] args) {
		int count = 1000000;
		StringBuilder sb = new StringBuilder();
		long startBuffer = System.nanoTime();
		for(int i=0;i<count;i++) {
			sb.append("hello");
		}
		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer-startBuffer;
		System.out.println("StringBuffer Time : "+bufferTime);
		
		System.out.println();
		
		StringBuffer sbr = new StringBuffer();
		long startBuilder = System.nanoTime();
		for(int i=0;i<count;i++) {
			sb.append("Hello");
		}
		long endBuilder = System.nanoTime();
		long builderTime = endBuilder-startBuilder;
		System.out.println("StringBuider Time : "+builderTime);
		
	}
}
