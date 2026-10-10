class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length ;
       // Travers
       for(int i = 0;i<n;i++){
        for(int j =i + 1 ;j < n ;j++){
            int temp = matrix[i][j] ;
           matrix[i][j] = matrix[j][i];
           matrix[j][i] = temp ; 
        }
       }
       /*    1   4   7
             2   5   8
             3   6   9

       */
       //Rotate  swap 
        for(int i= 0;i<n;i++){
            int left = 0 ;
            int rigth = n-1 ;
      while(left<rigth){
           int temp = matrix[i][left] ;
           matrix[i][left] = matrix[i][rigth] ;
           matrix[i][rigth] = temp ;
           left++ ;
           rigth-- ;
      }
        }
    }
}