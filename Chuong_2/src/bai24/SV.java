package bai24;

import java.util.Scanner;

public class SV {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số sinh viên, khởi tạo mảng chứa điểm và nhập điểm vào trong mảng điểm
		System.out.print("Nhap so luong sinh vien: ");
		int sl = input.nextInt();
		int[] diemSV = new int[sl];
		System.out.println("Nhap diem cua cac sinh vien (thang diem 100)");
		for (int i = 0; i < sl; i++) {
			System.out.print("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
			diemSV[i] = input.nextInt();
		}
		//Nhập điểm cần tìm
		System.out.print("Nhap diem cua sinh vien can tim: ");
		int diem = input.nextInt();
		boolean check = false;
		//Tìm sinh viên có điểm bằng với điểm vừa nhập
		System.out.println("Sinh vien co diem bang diem vua nhap: ");
		for (int i = 0; i < sl; i++) {
			if (diemSV[i] == diem) {
				check = true;
				System.out.println("Sinh vien thu " + (i + 1) + " ");
			}
		}
		if (check == false) {
			System.out.println("Khong tim thay sinh vien co diem bang diem vua nhap");
		}
		input.close();
	}
}
