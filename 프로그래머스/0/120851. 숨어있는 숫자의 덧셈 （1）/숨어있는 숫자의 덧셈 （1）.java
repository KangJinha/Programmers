class Solution {
    public int solution(String my_string) {
        String[] newArr = my_string.replaceAll("[^0-9]", "").split("");
        int answer = 0;
        
        
        for(int i=0; i<newArr.length; i++){
                answer += Integer.parseInt(newArr[i]);
        }
        
        return answer;
    }
}