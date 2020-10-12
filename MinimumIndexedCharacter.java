package main.java.companies;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given a string str and another string patt. Find the character in patt that is present 
 * at the minimum index in str. If no character of patt is present in str then print 
 * ‘No character present’.
 * Input:
 * str = geeksforgeeks
 * patt = set
 * Output: e
 * 
 * Explanation: e is the character which is present in given patt "geeksforgeeks" and is 
 * first found in str "set".
 * 
 * You only need to complete the function minIndexChar() that returns the index of answer in
 * str or returns -1 in case no character of patt is present in str. Expected Time 
 * Complexity: O(N). Expected Auxiliary Space: O(Number of distinct characters).
 * @author mohitjai
 *
 */
class MinimumIndexedCharacter {

    public static int minIndexChar(String str, String pat){
        // Your code here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), i);
            }
        }
        
        for(Entry<Character, Integer> entry : hashMap.entrySet()) {
        	System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        int minIndex = 0;
        boolean FirstValue = true;
        for(int i = 0; i < pat.length(); i++){
            if(hashMap.containsKey(pat.charAt(i))){
                if(FirstValue){
                    minIndex = hashMap.get(pat.charAt(i));
                    FirstValue = false;
                }
                if(hashMap.get(pat.charAt(i)) < minIndex){
                    minIndex = hashMap.get(pat.charAt(i));
                }
        
            }
        }

        if(!FirstValue){
            return minIndex;
        }
        
        return -1;
        
    }
    
    public static void main(String[] args) {
    	int s = MinimumIndexedCharacter.minIndexChar("laacbjfedrkwollbhfqfvkvpndxetrvetvgvenb", "jflhvzuwgconxaionnnugfpky");
    	System.out.println(s);
    }
}