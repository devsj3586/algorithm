// 중복된 숫자 개수
class Solution12 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i =0; i<array.length; i++) {
            if (array[i] == n) ++answer;
        }
        return answer;
    }
}
