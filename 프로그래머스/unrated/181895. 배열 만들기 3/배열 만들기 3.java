class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2];
        int i=0; 
        for(int j=intervals[0][0]; j<=intervals[0][1]; j++){
            answer[i] = arr[j];
            i++;       
        }
        for(int j=intervals[1][0]; j<=intervals[1][1]; j++){
            answer[i] = arr[j];
            i++;
        }

        return answer;
    }
}