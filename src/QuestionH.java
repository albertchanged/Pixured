/**
 * Created by albertchanged on 7/1/17.
 */
public class QuestionH {

    public static int solution(double[] A, double[] B, int N) {
//        If we don't have the N parameter specifying array length, we need this check below
//
//        if (A.length != B.length || A.length == 0) {
//            return 0;
//        }

        double[] C = new double[N];

        for (int i = 0; i < N; i++) {
            C[i] = A[i] + (B[i] / 1000000d);
        }
//        System.out.println(Arrays.toString(C));

        int count = 0;
        int firstIndex = -1;

//        Make sure the current index is not the last index of the list
        while (firstIndex++ != N - 1) {
            for (int i = firstIndex; i < N; i++) {
                if (firstIndex != i) {
                    double sumAB = C[firstIndex] + C[i];
                    double productAB = C[firstIndex] * C[i];
//                    System.out.println("Sum " + i + ": " + sumAB);
//                    System.out.println("Product " + i + ": " + productAB);
                    if (productAB >= sumAB) {
                        count++;
                    }
                }
            }
        }
        if (count > 1000000000) {
            return 1000000000;
        }
        return count;
    }

    public static void main(String[] args) {
        double[] A = {0, 1, 2, 2, 3, 5};
        double[] B = {500000, 500000, 0, 0, 0, 20000};

        System.out.println(solution(A, B, 6));
    }

    /*
     * Zero-indexed arrays A and B consisting of N non-negative integers are given.
     * Together, they represent N real numbers, denoted as C[0], ..., C[N−1].
     * Elements of A represent the integer parts and the corresponding elements of B (divided by 1,000,000)
     * represent the fractional parts of the elements of C.
     * More formally, A[I] and B[I] represent C[I] = A[I] + B[I] / 1,000,000.

     For example, consider the following arrays A and B:

     A[0] = 0	B[0] = 500,000
     A[1] = 1	B[1] = 500,000
     A[2] = 2	B[2] = 0
     A[3] = 2   B[3] = 0
     A[4] = 3	B[4] = 0
     A[5] = 5	B[5] = 20,000
     They represent the following real numbers:

     C[0] = 0.5
     C[1] = 1.5
     C[2] = 2.0
     C[3] = 2.0
     C[4] = 3.0
     C[5] = 5.02
     A pair of indices (P, Q) is multiplicative if 0 ≤ P < Q < N and C[P] * C[Q] ≥ C[P] + C[Q].

     The above arrays yield the following multiplicative pairs:

     (1, 4), because 1.5 * 3.0 = 4.5 ≥ 4.5 = 1.5 + 3.0,
     (1, 5), because 1.5 * 5.02 = 7.53 ≥ 6.52 = 1.5 + 5.02,
     (2, 3), because 2.0 * 2.0 = 4.0 ≥ 4.0 = 2.0 + 2.0,
     (2, 4) and (3, 4), because 2.0 * 3.0 = 6.0 ≥ 5.0 = 2.0 + 3.0.
     (2, 5) and (3, 5), because 2.0 * 5.02 = 10.04 ≥ 7.02 = 2.0 + 5.02.
     (4, 5), because 3.0 * 5.02 = 15.06 ≥ 8.02 = 3.0 + 5.02.
     Write a function:

     int solution(int A[], int B[], int N);

     that, given zero-indexed arrays A and B, each containing N non-negative integers, returns the number of multiplicative pairs of indices.

     If the number of multiplicative pairs is greater than 1,000,000,000, the function should return 1,000,000,000.

     For example, given:

     A[0] = 0	B[0] = 500,000
     A[1] = 1	B[1] = 500,000
     A[2] = 2	B[2] = 0
     A[3] = 2	B[3] = 0
     A[4] = 3	B[4] = 0
     A[5] = 5	B[5] = 20,000
     the function should return 8, as explained above.

     Assume that:

     N is an integer within the range [0..100,000];
     each element of array A is an integer within the range [0..1,000];
     each element of array B is an integer within the range [0..999,999];
     real numbers created from arrays are sorted in non-decreasing order.
     Complexity:

     expected worst-case time complexity is O(N);
     expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
     Elements of input arrays can be modified.

     class Solution { public int solution(int[] A, int[] B); }

     public func solution(_ A : inout [Int], _ B : inout [Int]) -> Int
     int solution(NSMutableArray *A, NSMutableArray *B);

     def solution(A, B)
     */
}
