class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map = new HashMap<>() ;
        for(int i= 0;i<words.length;i++){
            String word = words[i] ;
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        // maxmimum frequece matlab ki min heap 
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
                if (map.get(a).equals(map.get(b))) {
                return b.compareTo(a);
            }

            // Frequency compare
            return map.get(a) - map.get(b);
        });
        

        for(String word :map.keySet()){
            pq.offer(word) ;
            if(pq.size() > k){
                pq.poll() ;
            }
        }

        List<String> ans = new ArrayList<>() ;
          while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans ;
 
    }
}