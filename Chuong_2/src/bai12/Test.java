package bai12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số điểm của sinh viên
		System.out.print("Nhap so diem cua sinh vien: ");
		double diemThi = input.nextDouble();
		//Nhập lại nếu điểm không thỏa mãn
		while (diemThi > 100 || diemThi < 0) {
			System.out.print("Nhap sai, yeu cau nhap lai. Nhap so diem cua sinh vien: ");
			diemThi = input.nextDouble();
		}
		//Hiện thị xếp hạng của sinh viên với số điểm tương ứng
		if (diemThi >= 90) {
			System.out.println("Sinh vien xep loai A");
		}
		else if (diemThi < 90 && diemThi >= 80) {
			System.out.println("Sinh vien xep loai B");
		}
		else if (diemThi < 80 && diemThi >= 70) {
			System.out.println("Sinh vien xep loai C");
		}
		else if (diemThi < 70 && diemThi >= 50) {
			System.out.println("Sinh vien xep loai D");
		}
		else {
			System.out.println("Sinh vien xep loai F");
		}
		input.close();
	}
	
}
