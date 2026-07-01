class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0 ,result = 0 ;
        HashMap<Integer,Integer>map = new HashMap<>() ;
        map.put(0,1) ;//  empty
        for(int i = 0 ;i<nums.length;i++){
         sum += nums[i] ;
         int rem  = sum % k ;
         if(rem < 0){
          rem =  rem + k  ;
         }
         if(map.containsKey(rem)){
            result +=map.get(rem);
         }
         map.put(rem,map.getOrDefault(rem,0)+1) ;
        }
        return result ;
    }
}