class Solution {
    public String longestPrefix(String s) {
        int a = s.length();
        char ch[] = s.toCharArray();
        int lps[] = new int[a];
        lps[0] = 0;
        int i=1;//for next char
        int len = 0;//pointing prev val
        while(i<a){
            if(ch[i]==ch[len]){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }

            }


        }
        return s.substring(0,lps[a-1]);

    }
}