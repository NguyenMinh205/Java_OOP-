package bai6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int soThuNhat, soThuHai;
		Scanner input = new Scanner(System.in);
		//Nhập số nguyên
		System.out.print("Nhap so nguyen thu nhat: ");
		soThuNhat = input.nextInt();
		System.out.print("Nhap so nguyen thu hai: ");
		soThuHai = input.nextInt();
		//Các phép toán
		System.out.println("Tong cua 2 so da nhap la: " + (soThuNhat + soThuHai));
		System.out.println("Tru cua 2 so da nhap la: " + (soThuNhat - soThuHai));
		System.out.println("Tich cua 2 so da nhap la: " + (soThuNhat * soThuHai));
		System.out.println("Thuong cua 2 so da nhap la: " + ((float)soThuNhat / soThuHai));
		input.close();
	}
}
