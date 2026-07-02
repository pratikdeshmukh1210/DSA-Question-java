class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0 , sum = 0 ,sub = 0 ;
        HashMap<Integer,Integer>map = new HashMap<>() ;
        map.put(0,1) ;
        for(int i = 0 ;i < nums.length ;i++ ){
            sum += nums[i] ;
          sub = sum - goal ;
          if (map.containsKey(sub)) {
    res += map.get(sub);}
    map.put(sum, map.getOrDefault(sum, 0) + 1);
        
    }
    return res ;
}}