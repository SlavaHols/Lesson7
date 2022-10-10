package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task14 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int max = ar[0];
		int min = ar[0];
		int sum = 0;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-100, 100);
			System.out.println("ar[" + i + "] = " + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i = i + 2) {
			System.out.println("Chetnoe index :" + ar[i]);
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.println("Nechetnoe index :" + ar[i]);
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		sum = max + min;
		System.out.println("Summ max and min = " + sum);
	}
}
