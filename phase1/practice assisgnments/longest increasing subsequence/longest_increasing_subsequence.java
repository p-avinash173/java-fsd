package practice;

import java.util.Scanner;

public class longest_increasing_subsequence {
	public int[] lis(int[] X) {
		int n = X.length - 1;
		int[] A = new int[n + 1];
		int[] B = new int[n + 1];
		int C = 0;

		for (int i = 1; i < n + 1; i++) {
			int j = 0;
			for (int pos = C; pos >= 1; pos--) {
				if (X[A[pos]] < X[i]) {
					j = pos;
					break;
				}
			}
			B[i] = A[j];
			if (j == C || X[i] < X[A[j + 1]]) {
				A[j + 1] = i;
				C = Math.max(C, j + 1);
			}
		}

		int[] result = new int[C];
		int pos = A[C];
		for (int i = C - 1; i >= 0; i--) {
			result[i] = X[pos];
			pos = B[pos];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Longest Increasing Subsequence\n");

		System.out.println("Enter number of elements");
		int n = scan.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("\nEnter " + n + " elements");
		for (int i = 1; i <= n; i++)
			arr[i] = scan.nextInt();

		longest_increasing_subsequence obj = new longest_increasing_subsequence();
		int[] result = obj.lis(arr);
		System.out.print("\nLongest Increasing Subsequence : ");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}
}