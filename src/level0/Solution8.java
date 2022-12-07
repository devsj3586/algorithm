package level0;

// 두 수의 나눗셈 ( 형변화)
class Solution8 {
    public int solution(int num1, int num2) {
        float answer = (float) num1 / num2 * 1000;
        return (int) answer;
    }
}