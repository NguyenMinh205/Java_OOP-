package bai14;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số điện
		System.out.print("Nhap so dien: ");
		double soDien = input.nextDouble();
		//Nhập lại nếu số điện không đúng
		while (soDien < 0) {
			System.out.print("Nhap sai, yeu cau nhap lai. Nhap so dien: ");
			soDien = input.nextDouble();
		}
		//Hiện thị giá tiền phải thanh toán với số điện tương ứng
		if (0 < soDien && soDien <= 50) {
			System.out.println("Tong tien phai thanh toan: " + (soDien * 1484));
		}
		else if (50 < soDien && soDien <= 100) {
			System.out.println("Tong tien phai thanh toan: " + ((50 * 1484) + ((soDien -50) * 1533)));
		}
		else if (101 < soDien && soDien <= 200) {
			System.out.println("Tong tien phai thanh toan: " + ((50 * 1484) + (50 * 1533) + ((soDien - 100) * 1786)));
		}
		else {
			System.out.println("Tong tien phai thanh toan: " + ((50 * 1484) + (50 * 1533) + (100 * 1786) + ((soDien - 200) * 2242)));
		}
		input.close();
	}
}
