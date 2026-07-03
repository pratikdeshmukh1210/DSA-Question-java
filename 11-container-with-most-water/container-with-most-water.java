class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int rigth = height.length-1 ;
        int res = 0 ;
        while(left<rigth){
            int wid = rigth - left ;
            int ht = Math.min(height[left],height[rigth]) ;
            int area = wid * ht ;
            res = Math.max(res,area) ; 
         if(height[rigth] > height[left]){
            left++ ;
         }else{
            rigth-- ;
         }
         
        }
        return res ;
    }
}