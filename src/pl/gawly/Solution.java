package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        boolean[] positions = new boolean[A.length];
        int left = A.length;

        for(int i = 0; i < A.length; i++) {
            if (left > 0 && A[i]-1 < A.length && !positions[A[i]-1]) {
                left--;
                positions[A[i]-1] = true;
            }
        }

        return left == 0 ? 1 : 0;
    }
}
