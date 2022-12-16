package level0;

// 피자 나눠 먹기(3)
class Solution18 {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = (int) Math.ceil((double) n / slice);
        return answer;
    }
}