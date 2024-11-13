package bai10;

import java.util.Scanner;

public class HocVienLT extends HocVien {
	// Variables
	protected int soBuoi;
	protected double donGiaLT;

	// Constructors
	public HocVienLT() {
		super();
	}

	public HocVienLT(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGiaLT) {
		super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
	}

	// Getter and Setter
	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public double getDonGiaLT() {
		return donGiaLT;
	}

	public void setDonGiaLT(double donGiaLT) {
		this.donGiaLT = donGiaLT;
	}

	// Methods
	public void inputData() {
		Scanner input = new Scanner(System.in);
		super.inputData("Lap trinh");
		System.out.print("Nhap so buoi hoc: ");
		soBuoi = input.nextInt();
		System.out.print("Nhap don gia mot buoi lop lap trinh: ");
		donGiaLT = input.nextDouble();
	}

	@Override
	public double hocPhi() {
		double uuTien;
		if (this.loaiUuTien == 1) {
			uuTien = 1000000;
		} else {
			uuTien = 800000;
		}
		return (soBuoi * donGiaLT - uuTien);
	}

	public String toString() {
		return super.toString() + "\nHoc phi: " + this.hocPhi();
	}
}
