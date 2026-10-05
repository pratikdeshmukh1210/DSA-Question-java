class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i = 0; i<nums.length ;i++){
            long  current = nums[i] ; 
             if(nums[i] == first || current == second || current == third ){
           continue ;
             }
            if(current > first){
            
                third = second ;
                second = first ;
                first = current ;
            }
            else if(current > second){
                third = second ;
                second = current ;
            }
            else if(current > third){
                third = current ;
            }
        }
        if(third == Long.MIN_VALUE){
            return (int)first ;
        }
        return (int)third ;
    }
}