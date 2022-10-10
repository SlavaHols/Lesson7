package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-10, 10);
			System.out.println("ar[" + i + "] = " + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > i) {
				System.out.println(ar[i] + " > " + i);
			}
		}
	}

}
