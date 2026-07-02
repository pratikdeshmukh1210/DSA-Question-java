class Solution {
    public int findMaxLength(int[] nums) {
        int res  = 0 , zero = 0, one = 0, size = nums.length ,diff = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<size ;i++){
            if(nums[i] == 0){
                 zero++ ; }
            else one++ ;

        diff = zero - one ;
        if(diff == 0){
            res = Math.max(res,i+1) ;
            continue ;}  // length = (i= 1) 1+1 = 2 ; length

 if(!map.containsKey(diff)){
    map.put(diff,i) ;
 }
 else{
    int idx = map.get(diff) ;
    int length =  i - idx ;
    res = Math.max(length,res) ;
 }
        }
        return res ;
    }
}