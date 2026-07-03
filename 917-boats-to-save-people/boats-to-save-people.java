class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0 ;
        int rigth = people.length-1 ;
        int count = 0; 
        Arrays.sort(people) ;
        while(left<=rigth){
            int sum = people[rigth]+people[left] ;
            
            if(sum <= limit ){
                rigth--;
                left++ ;
            count++ ;
            }else{
                rigth-- ;
                count++;
            }
        }
        return count ;
    }
}