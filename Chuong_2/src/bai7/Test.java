package bai7;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float soThuNhat, soThuHai;
		char kiTu;
		//Nhập số thực và ký tự
		System.out.print("Nhap so thuc thu nhat: ");
		soThuNhat = input.nextFloat();
		System.out.print("Nhap so thuc thu hai: ");
		soThuHai = input.nextFloat();
		System.out.print("Nhap ki tu: ");
		kiTu = input.next().charAt(0);
		//Kiểm tra các kí tự nhập đúng chưa, nếu chưa yêu cầu nhập lại
		while (kiTu != 'A' || kiTu != 'S' || kiTu != 'M' || kiTu != 'D') {
			System.out.print("Nhap sai, yeu cau nhap lai. Nhap ki tu: ");
			kiTu = input.next().charAt(0);
		}
		//Thực hiện câu lệnh với kí tự tương ứng
		if (kiTu == 'A') {
			System.out.println("Voi ki tu A. Thuc hien thao tac cong 2 so. Tong 2 so la: " + (soThuNhat + soThuHai));
		}
		else if (kiTu == 'S') {
			System.out.println("Voi ki tu S. Thuc hien thao tac tru 2 so. Hieu 2 so la: " + (soThuNhat - soThuHai));
		}
		else if (kiTu == 'M') {
			System.out.println("Voi ki tu M. Thuc hien thao tac nhan 2 so. Tich 2 so la: " + (soThuNhat * soThuHai));
		}
		else {
			System.out.println("Voi ki tu D. Thuc hien thao tac chia 2 so. Thuong 2 so la: " + ((float)soThuNhat / soThuHai));
		}
		input.close();
	}
}
