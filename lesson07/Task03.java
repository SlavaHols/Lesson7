package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task03 {
	public static void main(String[] args) {
		int n = 10;
		int[] ar = new int[n];
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				System.out.println("Number: positive =" + ar[i] + ";");
			} else if (ar[i] < 0) {
				System.out.println("Number: negative =" + ar[i] + ";");
			} else {
				System.out.println("Number = 0 =" + ar[i] + ";");
			}

		}

	}

}
