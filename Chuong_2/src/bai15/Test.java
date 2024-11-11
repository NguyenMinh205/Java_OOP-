package bai15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số ngày lưu trú
		System.out.print("Nhap so ngay luu tru: ");
		int soNgay = input.nextInt();
		//Nhập lại nếu số ngày lưu trú không đúng
		while (soNgay < 0) {
			System.out.print("Nhap sai, yeu cau nhap lai. Nhap so ngay: ");
			soNgay = input.nextInt();
		}
		//Nhập đơn giá một ngày
		System.out.print("Nhap don gia ngay: ");
		double donGia = input.nextDouble();
		//Nhập lại nếu đơn giá không đúng
		while (donGia < 0) {
			System.out.print("Nhap sai, yeu cau nhap lai. Nhap don gia ngay: ");
			donGia = input.nextDouble();
		}
		//Hiện thị giá tiền phải thanh toán với số ngày lưu trú tương ứng với đơn giá ngày
		if (soNgay == 1) {
			System.out.println("Tong tien phai thanh toan: " + donGia);
		}
		else if (2 <= soNgay && soNgay <= 4) {
			System.out.println("Tong tien phai thanh toan: " + (donGia * soNgay - ((donGia * soNgay) * 0.2)));
		}
		else if (5 <= soNgay && soNgay <= 10) {
			System.out.println("Tong tien phai thanh toan: " + (donGia * soNgay - ((donGia * soNgay) * 0.4)));
		}
		else {
			System.out.println("Tong tien phai thanh toan: " + (donGia * soNgay - ((donGia * soNgay) * 0.6)));
		}
		input.close();
	}
}
