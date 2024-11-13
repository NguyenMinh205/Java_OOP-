package bai10;

import java.util.Scanner;

public abstract class HocVien {
	// Variables
	protected String hoTen;
	protected String diaChi;
	protected int loaiUuTien;
	protected String loaiChuongTrinh;

	// Constructors
	public HocVien() {
	}

	public HocVien(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	// Getter and Setter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getLoaiUuTien() {
		return loaiUuTien;
	}

	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	// Methods
	public void inputData(String loaiChuongTrinh) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen = input.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = input.nextLine();
		System.out.print("Nhap loai uu tien (1 hoac 2): ");
		loaiUuTien = input.nextInt();
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public abstract double hocPhi();

	public String toString() {
		return "Ho ten: " + this.hoTen + "\nDia chi: " + this.diaChi + "\nLoai uu tien: " + this.loaiUuTien
				+ "\nLoai chuong trinh: " + this.loaiChuongTrinh;
	}
}
