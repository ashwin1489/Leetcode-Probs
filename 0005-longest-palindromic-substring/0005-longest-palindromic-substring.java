class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1)return "";

        int start = 0;
        int end = 0;

        for(int i=0;i<s.length();i++){
            int len1 = efc(s,i,i);//odd
            int len2 = efc(s,i,i+1);//even

            int len = Math.max(len1,len2);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+ len/2;
            }
           
        }
         return s.substring(start,end+1);

    }
    private int efc(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            
           
        }
        return right-left-1;
    }     

        
}
/*
Time Complexity

We expand for every index.

Worst case: "aaaaaa"

O(n) expand × n centers = O(n²)

TC = O(n²)
💾 8️⃣ Space Complexity

Only variables.

SC = O(1)



Intuition

Every palindrome expands from a center.

🔹 Logic

For each index:

Check odd & even center

Expand while match

Track max length

I expand from every possible center to find the longest palindrome.”

*/