package level0;
// 배열 뒤집기
class Solution16 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length -i -1];
        }
        return answer;
    }
}