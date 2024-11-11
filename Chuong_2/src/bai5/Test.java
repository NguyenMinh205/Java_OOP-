package bai5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số nguyên
		System.out.print("Nhap so nguyen: ");
		int soNguyen = input.nextInt();
		//Nhập số thực
		System.out.print("Nhap so thuc: ");
		double soThuc = input.nextDouble();
		//Nhập kí tự
		System.out.print("Nhap ki tu: ");
		char kiTu = input.next().charAt(0);
		//Nhập chuỗi kí tự
		System.out.print("Nhap chuoi ki tu: ");
		input.nextLine();
		//In ra màn hình số nguyên, số thực, kí tự và chuỗi kí tự
		String chuoi = input.nextLine();
		System.out.println(soNguyen + "\n" + soThuc + "\n" + kiTu + "\n" + chuoi);
		input.close();
	}
}
