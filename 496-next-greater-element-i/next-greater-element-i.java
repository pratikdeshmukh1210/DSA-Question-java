class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        Stack <Integer> s = new Stack<>() ;
        HashMap<Integer,Integer> map = new HashMap<>() ;

    for(int i = arr.length-1;i>=0 ;i--) {
          
        while(!s.isEmpty() && s.peek() <= arr[i]){
            s.pop() ;
        }
        // 2 if -else 
        if(s.isEmpty()){
            map.put(arr[i],-1) ;
        }
        else{
           map.put(arr[i],s.peek()); 
        }
        s.push(arr[i]) ;
        }
      int nxtGreater[] =  new int [nums1.length] ;
     for(int i = 0 ;i<nums1.length;i++){
        nxtGreater[i] = map.get(nums1[i]);
     }
          return nxtGreater;
    }
}