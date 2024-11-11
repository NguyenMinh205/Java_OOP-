package bai20;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập nhiệt độ C
		System.out.print("Nhap nhiet do C: ");
		double doC = input.nextDouble();
		//Hiện thị kết quả đổi từ độ C sang độ F
		System.out.print("Nhiet do F khi doi tu nhiet do C: " + (doC * 1.8 + 32));
		input.close();
	}
}
