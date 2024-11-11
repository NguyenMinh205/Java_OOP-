package bai11;

import java.util.Scanner;
import java.lang.Math;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập bán kính của hình tròn
		System.out.print("Nhap ban kinh cua hinh tron: ");
		float banKinh = input.nextFloat();
		//Hiển thị chu vi và diện tích của hình tròn
		System.out.println("Chu vi cua hinh tron la: " + (2 * banKinh * Math.PI));
		System.out.println("Dien tich cua hinh tron la: " + (Math.pow(banKinh, 2) * Math.PI));
		input.close();
	}
}
