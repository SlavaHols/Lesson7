package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task20 {
	public static void main(String[] args) {
		int[] ar = new int[20];
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt();
			System.out.println("ar[" + i + "] =" + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i = i + 2) {
			ar[i] = 0;
		}
		System.out.println("New look array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] =" + ar[i] + ";");
		}
	}

}
