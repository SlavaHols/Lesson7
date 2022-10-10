package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task07 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int z = 50;
		int count = 0;
		Random inPutNum = new Random();
		System.out.println("Input Numbers :");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(100);
			System.out.println(ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= z) {
				ar[i] = z;
				count++;
			}
			System.out.println("ar[" + i + "] = " + ar[i] + ";");
		}
		System.out.println("Number of substitutions = " + count);
	}
}
