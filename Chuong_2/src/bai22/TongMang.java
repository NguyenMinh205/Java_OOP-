package bai22;

import java.util.Scanner;

public class TongMang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số phần tử trong mảng, khởi tạo mảng và nhập các phần tử trong mảng
		System.out.print("Nhap so luong phan tu trong mang: ");
		int sl = input.nextInt();
		int[] mang = new int[sl];
		int tong = 0;
		System.out.println("Nhap cac phan tu trong mang");
		for (int i = 0; i < sl; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			mang[i] = input.nextInt();
			tong += mang[i];
		}
		//Hiển thị tổng các phần tử trong mảng
		System.out.print("Tong cac phan tu da nhap: " + tong);
		input.close();
	}
}
