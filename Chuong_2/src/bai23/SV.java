package bai23;

import java.util.Scanner;

public class SV {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Nhập số sinh viên, khởi tạo mảng chứa điểm và nhập điểm vào trong mảng điểm
		System.out.print("Nhap so luong sinh vien: ");
		int sl = input.nextInt();
		int[] diemSV = new int[sl];
		System.out.println("Nhap diem cua cac sinh vien (thang diem 100");
		for (int i = 0; i < sl; i++) {
			System.out.print("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
			diemSV[i] = input.nextInt();
		}
		//Tìm điểm cao nhất sinh viên có điểm cao nhất
		int diemMax = diemSV[0];
		for (int i = 1; i < sl; i++) {
			if (diemMax < diemSV[i]) {
				diemMax = diemSV[i];
			}
		}
		System.out.println("Diem cao nhat dat duoc la: " + diemMax);
		//Tìm sinh viên có điểm cao nhất
		System.out.print("Sinh vien co diem cao nhat la sinh vien thu: ");
		for (int i = 1; i < sl; i++) {
			if (diemMax == diemSV[i]) {
				System.out.print((i + 1) + " ");
			}
		}
		//Sắp xếp sinh viên theo điểm tăng dần
		for (int i = 0; i < sl; i++) {
			for (int j = 0; j < sl - i - 1; j++) {
				if (diemSV[j] > diemSV[j + 1]) {
					int tg = diemSV[j];
					diemSV[j] = diemSV[j+1];
					diemSV[j + 1] = tg;
				}
			}
		}
		System.out.println("Danh sach diem duoc xep theo chieu tang dan: ");
		for (int i = 0; i < sl; i++) {
			System.out.print(diemSV[i] + " ");
		}
		input.close();
	}
}
