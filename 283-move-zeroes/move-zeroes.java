class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length - 1 ;
        int j =0 ;
     // two pointer
     for(int i = 0;i< nums.length;i++){
        if(nums[i]!=0){
            int temp = nums[i];
            nums[i] = nums[j] ;
            nums[j] = temp ;
            j++;
        }
     }
    }
}
