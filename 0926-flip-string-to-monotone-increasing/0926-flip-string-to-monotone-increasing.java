class Solution {
    public int minFlipsMonoIncr(String s) {
        int o=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                o++;
               } else{
                    k=Math.min(k+1,o);

                }
            }
            return k;
        }
        
    }
  