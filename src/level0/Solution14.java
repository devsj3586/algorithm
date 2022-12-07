package level0;
// 피자 나눠 먹기(1)
class Solution14 {
    public int solution(int n) {
        int answer = 0;
        while (n >= 7) {
            n = n - 7;
            answer++;
        }
        if (n > 0) answer++;
        return answer;
    }
}