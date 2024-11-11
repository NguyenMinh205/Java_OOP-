package bai18;

import java.util.Scanner;
import java.lang.Math;

public class SoNT {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		int n = input.nextInt();
		if (n == 1) {
			System.out.print("Day khong phai la so nguyen to.");
			return;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print("Day khong phai la so nguyen to.");
				return;
			}
		}
		System.out.print("Day la so nguyen to.");
	}
}
