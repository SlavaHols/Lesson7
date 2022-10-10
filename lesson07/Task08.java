package lesson7.lt.lhu.lesson07;

import java.util.Random;

public class Task08 {
	public static void main(String[] args) {
		int[] ar = new int[1000];
		int counNegative = 0;
		int counPositive = 0;
		int counNull = 0;
		Random inPutNum = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = inPutNum.nextInt(-20, 100);
			System.out.println("ar [" + i + "] = " + ar[i] + ";");
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				counPositive++;
			} else if (ar[i] < 0) {
				counNegative++;
			} else if (ar[i] == 0) {
				counNull++;
			}
		}
		System.out.println("counPositive = " + counPositive + ";");
		System.out.println("counNegative = " + counNegative + ";");
		System.out.println("counNull = " + counNull + ";");
	}

}
