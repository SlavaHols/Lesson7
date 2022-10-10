package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task06 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int min = ar[0];
		int max = ar[0];
		int axlelength = 0;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-10, 10);
			System.out.println("ar [" + i + "] = " + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] > max) {
					max = ar[j];
				}
			}
			axlelength = max - min;
		}
		System.out.println("max  = " + max);
		System.out.println("min  = " + min);
		System.out.println("Axle length = " + axlelength + ".");
	}

}
