package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task11 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int m = 30;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-100, 1000);
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		for (int i = 0; i < ar.length; i++) {
			int a = ar[i] / m;
			int b = m - 1;
			if (a > 0 && a < b) {
				System.out.println(ar[i] + ";");

			}
		}

	}

}
