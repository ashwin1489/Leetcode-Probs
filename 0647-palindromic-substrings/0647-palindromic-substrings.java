class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            count+=ecf(s,i,i);//odd length
            count+=ecf(s,i,i+1);//even length
        }
        return count;
        
    }
    private int ecf(String s,int left,int right){
        int count = 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}


/*
Intuition

Every palindrome grows from a center.

🔹 Logic

For each index:

Expand odd

Expand even

Count matches

🔹 One-Line

Expand from all centers and count.

🔹 TC / SC

TC = O(n²)
SC = O(1)

🔹 Interview Line

“I expand around each center and count palindromes


*/