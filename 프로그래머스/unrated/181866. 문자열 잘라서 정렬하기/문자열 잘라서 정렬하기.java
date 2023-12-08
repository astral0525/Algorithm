import java.util.*;

class Solution {
    public String[] solution(String myString) {

        String[] answer = myString.split("x");
        String[] answer1 = Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        Arrays.sort(answer1);
        return answer1;
    }
}