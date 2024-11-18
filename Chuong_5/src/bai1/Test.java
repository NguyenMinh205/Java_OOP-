package bai1;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CircleCollection cc = new CircleCollection();
		System.out.print("Nhap so luong hinh tron muon tao: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			double radius = new Random().nextDouble() * 1000;
			cc.addCircle(new Circle(radius));
		}
		
		System.out.println("Danh sach cac hinh tron duoc tao");
		cc.toString();
		
		System.out.println("Tong tat ca dien tich cua cac hinh tron da tao: " + cc.calcSumArea());
		System.out.println("Dien tich nho nhat dat duoc la: " + cc.findMinArea());
		System.out.println("Dien tich lon nhat dat duoc la: " + cc.findMaxArea());
	}
}
