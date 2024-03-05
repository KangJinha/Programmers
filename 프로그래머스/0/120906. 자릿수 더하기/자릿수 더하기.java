class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            int mok = n/10;
            n = mok;
        }
        
        return answer;
    }
}