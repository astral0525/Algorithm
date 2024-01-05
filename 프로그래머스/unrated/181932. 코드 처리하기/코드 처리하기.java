class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char[] charCode = code.toCharArray();
        int mode = 0;
        for(int idx = 0; idx<code.length(); idx++){
            if(mode ==0){
                if(charCode[idx] != '1'){
                    if(idx%2==0) sb.append(charCode[idx]);
                }
                else{
                    mode = 1;
                }
            }
            else{ //mode ==1
                if(charCode[idx] != '1'){
                    if(idx%2==1) sb.append(charCode[idx]);
                }
                else{
                    mode = 0;
                }
            }
        }
        
    
    try{
        String ret = sb.toString();
        return ret.equals("")?"EMPTY":ret; 
    }catch(Exception e ){
        return "EMPTY";
    }
}
}