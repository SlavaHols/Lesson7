package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task09 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int max = ar[0];
		int min = ar[0];
		int maxInd = 0;
		int minInd = 0;
		int temp = 0;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-10, 100);
			System.out.println("ar[" + i + "] = " + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				maxInd = i;
			} else if (ar[i] < min) {
				min = ar[i];
				minInd = i;
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		temp = ar[maxInd];
		ar[maxInd] = ar[minInd];
		ar[minInd] = temp;
		System.out.println("Sorting array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i] + ";");
		}
	}
}
