class Solution {
    public int[] searchRange(int[] nums ,int target) {
        int n= nums.length ;
        int res[] = {-1,-1} ;
        int low = 0 , high = n-1 ;
        while(low <= high){
            int guess = (low+high)/2 ;
            if(nums[guess]<target){
                low = guess+1 ;
                        }
            else if(nums[guess]>target){
                high = guess-1 ;
            }
            else{
                res[0] =  guess ;
                high = guess-1 ;
            }
        }

        low = 0 ; high = n-1 ;
        while(low<= high){
            int guess = (low+high)/2 ;
            if(nums[guess]<target){
                low = guess+1 ;
                        }
            else if(nums[guess]>target){
                high = guess-1 ;
            }
            else{
                res[1] = guess ;
                low= guess+1 ;
            }
        }
      return  res ;

    }
}