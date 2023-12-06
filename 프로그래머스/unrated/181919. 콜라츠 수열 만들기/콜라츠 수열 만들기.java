import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1){
            if(n%2 ==0){
                n = n/2;
                list.add(n);
            }
            else{
                n = 3*n +1;
                list.add(n);
            }
        }
         answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}