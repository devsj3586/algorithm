package level0;

// 문자열 뒤집기
class Solution17 {
    public String solution(String my_string) {
        StringBuffer words = new StringBuffer(my_string);
        String answer = words.reverse().toString();
        return answer;
    }
}
