package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task13 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int m = 5;
		int l = 0;
		int n = 50;
		int count = 0;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-10, 100);
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 5 == 0 && ar[i] >= l && ar[i] <= n) {
				count++;
				System.out.println("ar[" + i + "] = " + ar[i] + " multiple of: " + m + "  and be between 10 and 20. ");

			} else {
				System.out.println(ar[i] + ": Number are not in this range.");

			}
		}
		System.out.println("Number of count = :" + count);
	}

}
