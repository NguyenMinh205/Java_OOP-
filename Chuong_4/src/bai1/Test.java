package bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soNguyen1, soNguyen2;
		try {
			System.out.print("Nhap so nguyen thu nhat: ");
			soNguyen1 = input.nextInt();
			System.out.print("Nhap so nguyen thu hai: ");
			soNguyen2 = input.nextInt();
			System.out.print("Thuong cua 2 so nguyen da nhap la: " + soNguyen1/soNguyen2);
		} catch (InputMismatchException i) {
			System.out.print("Nhap sai kieu du lieu.");
		} catch (ArithmeticException a) {
			System.out.print("Khong chia duoc cho so 0.");
		} catch (Exception e) {
			System.out.print("Loi cu phap.");
		}
	}
}
