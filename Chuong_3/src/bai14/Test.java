package bai14;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so luong cong nhan khoan san pham muon nhap: ");
		int slcn1 = input.nextInt();
		CNKSP[] congNhanKSP = new CNKSP[slcn1];
		for (int i = 0; i < slcn1; i++) {
			System.out.println("Nhap thong tin cong nhan khoan san pham thu " + (i + 1) + ": ");
			congNhanKSP[i] = new CNKSP();
			congNhanKSP[i].inputData();
		}
		System.out.print("Nhap so luong cong nhan tinh cong nhat muon nhap: ");
		int slcn2 = input.nextInt();
		CNTCN[] congNhanTCN = new CNTCN[slcn2];
		for (int i = 0; i < slcn2; i++) {
			System.out.println("Nhap thong tin cong nhan tinh cong nhat thu " + (i + 1) + ": ");
			congNhanTCN[i] = new CNTCN();
			congNhanTCN[i].inputData();
		}
		
		System.out.println("Thong tin cac cong nhan khoan san pham da nhap");
		for (int i = 0; i < slcn1; i++) {
			System.out.println("Thong tin cong nhan khoan san pham thu " + (i + 1) + ": ");
			System.out.println(congNhanKSP[i].toString());
		}
		
		System.out.println("Thong tin cac cong nhan tinh cong nhat da nhap");
		for (int i = 0; i < slcn2; i++) {
			System.out.println("Thong tin cong nhan tinh cong nhat thu " + (i + 1) + ": ");
			System.out.println(congNhanTCN[i].toString());
		}
		input.close();
	}
}
