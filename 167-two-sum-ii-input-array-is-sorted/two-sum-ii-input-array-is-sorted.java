class Solution {
    public int[] twoSum(int[] numbers, int target) {
         
    int fist = 0 ;int last = numbers.length-1 ;
    while(fist<last){
            int sum =numbers[fist] +numbers[last] ;
        if(sum == target){
            return new int[]{fist+1,last+1} ; 
        }
        else if(sum < target){
            fist++ ;
        }
        else{
            last-- ;
        }
    }
    return new int[]{};
    }
}