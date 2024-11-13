package bai10;

import java.util.Scanner;

public class HocVienDH extends HocVien {
	// Variables
	protected int soBuoi;
	protected double donGiaDH;

	// Constructors
	public HocVienDH() {
		super();
	}

	public HocVienDH(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGiaDH) {
		super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
	}

	// Getter and Setter
	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public double getDonGiaDH() {
		return donGiaDH;
	}

	public void setDonGiaDH(double donGiaDH) {
		this.donGiaDH = donGiaDH;
	}

	// Methods
	public void inputData() {
		Scanner input = new Scanner(System.in);
		super.inputData("Do hoa");
		System.out.print("Nhap so buoi hoc: ");
		soBuoi = input.nextInt();
		System.out.print("Nhap don gia mot buoi lop do hoa: ");
		donGiaDH = input.nextDouble();
	}

	@Override
	public double hocPhi() {
		double uuTien;
		if (this.loaiUuTien == 1) {
			uuTien = 1000000;
		} else {
			uuTien = 500000;
		}
		return (soBuoi * donGiaDH - uuTien);
	}

	public String toString() {
		return super.toString() + "\nHoc phi: " + this.hocPhi();
	}
}
