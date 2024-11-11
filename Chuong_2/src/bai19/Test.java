package bai19;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số giờ, số phút, số giây
		System.out.print("Nhap so gio: ");
		int gio = input.nextInt();
		System.out.print("Nhap so phut: ");
		int phut = input.nextInt();
		System.out.print("Nhap so giay: ");
		int giay = input.nextInt();
		//Hiển thị tổng số giây 
		System.out.println("Tong so giay voi so gio, phut va giay da nhap la: " + (gio * 3600 + phut * 60 + giay));
		input.close();
	}
}
