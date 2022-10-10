package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task15 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int c = 10;
		int d = 20;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-100, 100);
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > c && ar[i] < d) {
				System.out.println("ar[" + i + "] = " + ar[i]);
			} else {
				System.out.println("Number from c to d is not");
			}
		}

	}
}
