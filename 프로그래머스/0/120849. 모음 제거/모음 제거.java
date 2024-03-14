class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] mo = {"a", "e", "i", "o", "u"};
        
        for(int i=0; i<mo.length; i++){
            if(my_string.contains(mo[i])){
                answer = my_string.replaceAll(mo[i], "");
                my_string = answer;
            } else{
                answer = my_string;
            }
        }
        
        return answer;
    }
}