package bai13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập giá bán và phần trăm giảm giá của 1 sản phẩm
		System.out.print("Nhap gia ban: ");
		double giaBan = input.nextDouble();
		System.out.print("Nhap phan tram giam gia: ");
		double phanTram = input.nextDouble();
		//Hiện thị giá của sản phẩm sau giảm giá
		System.out.print("Gia ban sau khi giam la: " + (giaBan * phanTram));
		input.close();
	}
}
