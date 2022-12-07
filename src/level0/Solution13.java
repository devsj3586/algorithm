package level0;

//  머쓱이 보다 키큰사람
class Solution13 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }
        return answer;
    }
}

// foreach 문과 삼항 연산자 사용
//    public int solution(int[] array, int height) {
//        int answer = 0;
//        for (int i : array) {
//            answer += (i > height) ? 1 : 0;
//        }
//        return answer;
//    }