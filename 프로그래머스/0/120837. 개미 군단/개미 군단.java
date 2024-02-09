class Solution {
    public int solution(int hp) {
        
        int result = hp/5 + hp%5/3 + hp%5%3;
        
        return result;
    }
}