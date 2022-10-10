package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task04 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		Random inPutNum = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(100);
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > (ar[i + 1])) {
				System.out.println("Ubivaet;");
			} else if (ar[i] < (ar[i + 1])) {
				System.out.println("Rastet;");
			} else {
				System.out.println("Ne menyaetsya;");
			}
		}

	}
}
