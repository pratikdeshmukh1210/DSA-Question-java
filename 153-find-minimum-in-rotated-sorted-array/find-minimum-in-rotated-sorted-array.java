class Solution {
    public int findMin(int[] nums) {
         int left =0;
         int n = nums.length; 
         int rigth = n-1 ;
        int res = -1 ;
        while(left<=rigth){
            int guess = (left+rigth)/2 ;
            if(nums[guess]>nums[n-1]){
               left = guess+1 ;
            }
            else{
                res=nums[guess] ;
                rigth = guess-1;

            }
        }
        return res ;
    }
}