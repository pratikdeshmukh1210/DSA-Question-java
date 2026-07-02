class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res  = 0 , sum =0 ,sub = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
           map.put(0,1) ;
        for(int i = 0;i<nums.length ;i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0 ;
            }
            else{
                nums[i] = 1 ;
            } 
            sum += nums[i] ;
            // 1,1,0,1,1,
            // k=3 ;
           sub =  sum - k   ;
          if (map.containsKey(sub)) {
    res += map.get(sub);}
    map.put(sum, map.getOrDefault(sum, 0) + 1);
        
        }
        return res ;
    }
}