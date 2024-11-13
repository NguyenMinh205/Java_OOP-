package bai14;

import java.util.Scanner;

public class CNKSP extends CongNhan{
	//Variables
	protected int soSP;
	protected double donGia;
	protected int soSPQD;
	
	//Constructors
	public CNKSP () {
		super();
	}

	public CNKSP(int soSP, double donGia, int soSPQD, String hoTen, String diaChi, String loaiCN, String ngaySinh) {
		super(hoTen, diaChi, loaiCN, ngaySinh);
		this.soSP = soSP;
		this.donGia = donGia;
		this.soSPQD = soSPQD;
	}

	//Getter and Setter
	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoSPQD() {
		return soSPQD;
	}

	public void setSoSPQD(int soSPQD) {
		this.soSPQD = soSPQD;
	}

	//Methods
	public void inputData () {
		super.inputData("Cong nhan tinh cong nhat");
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so san pham lam duoc cua cong nhan: ");
		this.soSP = input.nextInt();
		System.out.print("Nhap don gia cua san pham: ");
		this.donGia = input.nextDouble();
		System.out.print("Nhap so san pham quy dinh: ");
		this.soSPQD = input.nextInt();
	}
	@Override
	public double tinhLuong() {
		double thuong;
		if (soSP <= soSPQD) {
			thuong = 0;
		}
		else if ((soSP - soSPQD) < 150 && (soSP - soSPQD) >= 100) {
			thuong = 1000000;
		}
		else {
			thuong = 1500000;
		}
		return (soSP * donGia + thuong);
	}
	
	public String toString () {
		return super.toString() + "\nLuong thang: " + this.tinhLuong();
	}
}
