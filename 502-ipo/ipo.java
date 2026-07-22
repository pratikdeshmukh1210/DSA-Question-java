class Solution {
    class Project{
        int cap ;
        int profit ;
        Project(int cap,int profit){
            this.cap = cap ;
            this.profit = profit ;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n =  profits.length ;

    Project[] projects = new Project[n] ;
    for(int i = 0;i<n;i++){
        projects[i] = new Project(capital[i],profits[i]) ;
    }
    // calpital 
    Arrays.sort(projects, (a,b) -> a.cap - b.cap) ;

    // max
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a) ;
    int idx = 0 ;
    while(k-- > 0){
        while(idx < n && projects[idx].cap <= w){
            
            pq.offer(projects[idx].profit);
            idx++; 
        }
        if(pq.isEmpty()){
            return w ;
        }
        w+=pq.poll() ;
    } 
    return w ;
    }
}