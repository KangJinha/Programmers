class Solution {
    public double solution(int n, int t) {
        double answer;
        double pow;
        pow = Math.pow(2, t);
        
        answer = n * pow;
        return answer;
    }
}