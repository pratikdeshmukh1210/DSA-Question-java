class Solution {
    public String removeDuplicates(String s, int k) {
        class Pair{
            char ch ;
            int count ;
            Pair(char ch ,int count){
              this.ch =ch ;
              this.count = count ;
            }
        }
        int n = s.length() ;
        Stack<Pair> st = new Stack<>() ;
        for(int i= 0;i<n;i++){
            char ch = s.charAt(i) ;
            if(st.isEmpty()){
                st.push(new Pair(ch,1)) ;
                continue ;
            }
            if(st.peek().ch != ch ){
                st.push(new Pair(ch,1)) ;
            }
            else{
                Pair p = st.peek() ;
                p.count++ ;
                if(p.count == k){
                    st.pop() ;}
                
            }
            
        }
           StringBuilder ans = new StringBuilder();
            while(!st.isEmpty()){
                Pair p = st.peek();
                 st.pop();
                while(p.count-- > 0){
              ans.append(p.ch);
               }
            }
            return ans.reverse().toString();
        
    }
}