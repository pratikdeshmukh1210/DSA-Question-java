class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int left = 0 ;
        int rigth = tokens.length-1 ;
        int score = 0;
        int maxscore = 0;
        Arrays.sort(tokens);
        while(left<=rigth){
         if(tokens[left]<=power){
            power-=tokens[left] ;
            score++ ;
            maxscore = Math.max(maxscore,score) ;
            left++ ;
         }else if (score > 0){
            power +=tokens[rigth] ;
           rigth-- ;
           score--;
         }
         else{break;}
        }
        return maxscore ;
    }
}