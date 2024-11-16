package bai5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		try {
			System.out.print("Nhap tien luong cua mot nguoi (tu 5000000 den 20000000): ");
			double tienLuong = input.nextDouble();
			Test.checkLuong(tienLuong);
			System.out.println("Tien luong cua mot nguoi la: " + tienLuong);
			System.out.println("Done");
		} catch (OutOfRangeException oore) {
			System.out.println(oore.getMessage());
		}
	}
	
	public static void checkLuong(double tienLuong) throws OutOfRangeException{
		if (tienLuong < 5000000 || tienLuong > 20000000) {
			throw new OutOfRangeException("So tien luong khong nam trong vung yeu cau.");
		}
	}
}
