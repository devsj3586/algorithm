package level0;

class Solution10 {
    public double solution(int[] arr) {
        double sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}