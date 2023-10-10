class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        int count = 1;
        
        for(int i=0;i<emergency.length; i++){
            for(int j=0;j<emergency.length;j++){
                if(i!=j && emergency[i]<emergency[j]){
                    count++;
                }
            }
            answer[i] = count;
            count = 1;
        }
        
        return answer;
    }
}