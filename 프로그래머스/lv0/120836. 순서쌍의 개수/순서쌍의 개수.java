class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i=1;i<=n; i++){
            if(n%i != 0) continue;
            for(int j=1; j<=n; j++){
                if(i * j == n){
                    count ++;
                }
            }
        }
        return count;
    }
}