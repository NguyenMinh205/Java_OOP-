package bai21;

import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số phần tử trong mảng, khởi tạo mảng và nhập các phần tử trong mảng
		System.out.print("Nhap so luong phan tu trong mang: ");
		int sl = input.nextInt();
		int[] mang = new int[sl];
		System.out.println("Nhap cac phan tu trong mang");
		for (int i = 0; i < sl; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			mang[i] = input.nextInt();
		}
		//Hiển thị các phần tử trong mảng
		System.out.print("Mang cac phan tu da nhap: ");
		for (int i = 0; i < sl; i++) {
			System.out.print(mang[i] + " ");
		}
		input.close();
	}
}
