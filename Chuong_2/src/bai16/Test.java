package bai16;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		int n = input.nextInt();
		int kq = 1;
		//Tính giai thừa của số đã nhập
		for (int i = 2; i <= n; i++) {
			kq *= i;
		}
		System.out.println("Giai thua cua so da nhap la: " + kq);
		input.close();
	}
}
