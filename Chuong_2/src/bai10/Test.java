package bai10;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập các thông số chiều dài và chiều rộng của hình chữ nhật
		System.out.print("Nhap chieu rong cua hinh chu nhat: ");
		float chieuDai = input.nextFloat();
		System.out.print("Nhap chieu rong cua hinh chu nhat: ");
		float chieuRong = input.nextFloat();
		//Hiển thị chu vi và diện tích của hình chữ nhật
		System.out.println("Chu vi cua hinh chu nhat la: " + ((chieuDai + chieuRong) * 2));
		System.out.println("Dien tich cua hinh chu nhat la: " + (chieuDai * chieuRong));
		input.close();
	}
}
