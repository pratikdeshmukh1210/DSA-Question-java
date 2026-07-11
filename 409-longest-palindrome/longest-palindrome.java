class Solution {
    public int longestPalindrome(String s) {
        int res = 0 ;
        boolean odd = false ;
        HashMap<Character,Integer> map = new HashMap<>() ;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1) ;
            
        }
        for (char ch : map.keySet()) {
          int val = map.get(ch);
            if(val % 2 == 0){
                res+=val;
            }
            else{
                   res+=val-1 ;
                   odd = true ;
                        }
                    }
                    if (odd) {
             return res + 1;
              }
        
        return res ;
    }
}