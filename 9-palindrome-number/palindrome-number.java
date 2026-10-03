class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x) ;
        int left = 0 ;
        int right = s.length()-1 ;
        boolean isPlaindrome = true ;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPlaindrome = false ;
                break ;
            }

            left++ ;
            right-- ;
        }
     return isPlaindrome ;
    }
}