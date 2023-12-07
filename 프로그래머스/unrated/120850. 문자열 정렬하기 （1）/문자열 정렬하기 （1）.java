import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        int n=0; 
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++ ){
            if(Character.isDigit(my_string.charAt(i))){
                if(n==0){
                    list.add(my_string.charAt(i)- '0');
                    n++;
                }else{
                    n++;
                    for(int j=0; j<n-1; j++){
                        if(list.get(j)>=(my_string.charAt(i)-'0')){
                            list.add(j, my_string.charAt(i)-'0');
                            break;
                        }
                    }
                    if(n!=list.size()){
                        list.add(my_string.charAt(i)-'0');
                    }

                }
                
            }   
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}