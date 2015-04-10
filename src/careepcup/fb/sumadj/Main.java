package careepcup.fb.sumadj;

public class Main {

    /*
     * http://www.careercup.com/question?id=6305076727513088
     * 
     * Worst case: O(2*n)
     * [ 1, 3, 4, 1, 1, 23 ] and k == 23. We have to iterate over the array twice:
     * 
     * 1. We sum up all the elements [0, n - 1], n - the array size
     * 2. We subtract all the elements [0, n - 2]
     * 
     * $
     * [1, 2, 3, 4, 50, 23] and k == 23
     */
    static boolean findSum(int[] array, int k) {
        for (int i = 0, start = 0, sum = 0; i < array.length;) {
            if (array[i] > k) {
                start = ++i;
                sum = 0;
                continue;
            }
            sum += array[i];
            i++;
            while (sum > k) {
                sum -= array[start];
                start++;
            }
            if (sum == k) {
                return true;
            }
        }
        return k == 0;
    }

}
