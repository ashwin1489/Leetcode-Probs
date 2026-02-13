class Solution {
    Boolean dp[][];
    boolean wm(String s, String p,int i, int j) {
        //base cases 
        if(i==s.length() && j==p.length())return true;
        if(i==s.length()){
            for(int index = j;index<p.length();index++){
                if(p.charAt(index)!='*')return false;

            }
            return true;
        }
        if(j==p.length() && i!=s.length())return false;

        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean ans  = false;

        if(p.charAt(j)=='?'){
            if(wm(s,p,i+1,j+1)){
                ans  = true;
            }
        }
        else if(p.charAt(j)=='*'){
            if(wm(s,p,i,j+1)){
                ans = true;
            }
            if(wm(s,p,i+1,j)){
                ans = true;
            }
            if(wm(s,p,i+1,j+1)){
                ans = true;
            }
        }else{
            //both i and j are pointing towards char
            if(s.charAt(i)==p.charAt(j) && wm(s,p,i+1,j+1)){
                ans = true;
            }
        }dp[i][j] = ans;
        return ans;

        
    }
    public boolean isMatch(String s,String p){
        dp = new Boolean[s.length()][p.length()];
        return wm(s,p,0,0);
    }
}