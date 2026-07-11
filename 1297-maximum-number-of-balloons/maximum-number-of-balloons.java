class Solution {
    public int maxNumberOfBalloons(String text) {
         int n = text.length();
         int res = Integer.MAX_VALUE;
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b',1) ;
        need.put('a',1) ;
        need.put('l',2) ;
        need.put('o',2) ;
        need.put('n',1) ;
        HashMap<Character, Integer> have = new HashMap<>();


        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Compare frequencies
       for(char ch:need.keySet()){
        if(!have.containsKey(ch)){
            return 0 ;
        }
        if(have.get(ch)<need.get(ch)){
         return 0 ;
        }
        int time = have.get(ch)/need.get(ch) ;
        res =Math.min(res,time) ;

       }
        return res;
    }
}