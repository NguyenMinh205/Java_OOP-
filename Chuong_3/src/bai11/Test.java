package bai11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so luong giang vien co huu muon nhap: ");
		int slch = input.nextInt();
		GiangVienCH[] gVCH = new GiangVienCH[slch];
		for (int i = 0; i < slch; i++) {
			System.out.println("Nhap thong tin giang vien co huu thu " + (i + 1) + ": ");
			gVCH[i] = new GiangVienCH();
			gVCH[i].inputData();
		}
		System.out.print("Nhap so luong giang vien thinh giang muon nhap: ");
		int sltg = input.nextInt();
		GiangVienTG[] gVTG = new GiangVienTG[sltg];
		for (int i = 0; i < sltg; i++) {
			System.out.println("Nhap thong tin giang vien thinh giang thu " + (i + 1) + ": ");
			gVTG[i] = new GiangVienTG();
			gVTG[i].inputData();
		}
		
		System.out.print("Thong tin cac giang vien co huu da nhap");
		for (int i = 0; i < slch; i++) {
			System.out.println("Giang vien co huu thu " + (i + 1) + ": ");
			System.out.print(gVCH[i].toString());
		}
		
		System.out.print("Thong tin cac giang vien thinh giang da nhap");
		for (int i = 0; i < sltg; i++) {
			System.out.println("Giang vien thinh giang thu " + (i + 1) + ": ");
			System.out.print(gVTG[i].toString());
		}
		input.close();
	}
}
