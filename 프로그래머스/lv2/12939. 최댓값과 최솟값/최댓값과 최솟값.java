import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        
        for(int i=0; i<iArr.length ;i++){
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(iArr);
        answer = iArr[0]+" "+ iArr[iArr.length-1];
        return answer;
    }
}