package oops_practice.leetcode;

public class FirstOccurenceofaString {
	public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
    return -1;
    }
}
